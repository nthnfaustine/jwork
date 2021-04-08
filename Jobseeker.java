/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Jobseeker
{
    // instance variables dari Jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /*
      Constructor dari Jobseeker
    */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    
    public Jobseeker(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }

    /**
     * metode
     *
     * @param     void
     * @return    id
     */
    public int getId(){
        return id;
    }
    
    /**
     * metode
     *
     * @param     void
     * @return    name
     */
    public String getName(){
        return name;
    }
    
    /**
     * metode
     *
     * @param     void
     * @return    email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * metode
     *
     * @param     void
     * @return    password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * metode
     *
     * @param     void
     * @return    date
     */
     public Calendar getJoinDate(){
        return joinDate;
    }

    /**
     * metode untuk ganti id
     *
     * @param     id
     * @return    void
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * metode untuk ganti name
     *
     * @param     name
     * @return    void
     */
    public void setName(String Name){
        this.name = name;
    }
    
    /**
     * metode untuk ganti email
     *
     * @param     email
     * @return    void
     */
    public void setEmail(String email){
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    
    /**
     * metode untuk ganti password
     *
     * @param     password
     * @return    void
     */
    public void setPassword(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    
    /**
     * metode untuk ganti date
     *
     * @param     join date
     * @return    void
     */
    public void setJoinDate(Calendar joinDate){
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /**
     * metode untuk print nama jobseeker
     *
     * @param     void
     * @return    void
     */
    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }
    }
}
