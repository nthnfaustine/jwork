/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

public class Jobseeker
{
    // instance variables dari Jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /*
      Constructor dari Jobseeker
    */
    public Jobseeker(int id, String name, String email, String password, String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
     public String joinDate(){
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
        this.email = email;
    }
    
    /**
     * metode untuk ganti password
     *
     * @param     password
     * @return    void
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * metode untuk ganti date
     *
     * @param     join date
     * @return    void
     */
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    
    /**
     * metode untuk print nama jobseeker
     *
     * @param     void
     * @return    void
     */
    public void printData(){
        System.out.println(getName());
    }
}
