package nathanielfaustine.jwork;
/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

public class Recruiter
{
    // instance variables dari class Recruiter
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Metode untuk return id
     *
     * @param     void
     * @return    id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Metode untuk return nama
     *
     * @param     void
     * @return    name
     */
    public String getName(){
        return name;
    }
        
    /**
     * Metode untuk return email
     *
     * @param     void
     * @return    email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Metode untuk return nomor telefon
     *
     * @param     void
     * @return    phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /**
     * Metode untuk merubah id
     *
     * @param     id
     * @return    void
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Metode untuk merubah email
     *
     * @param     email
     * @return    void
     */
    public void setEmail(String Email){
        this.email = email;
    }
    
    /**
     * Metode untuk merubah nama
     *
     * @param     name
     * @return    void
     */
    public void setName(String Name){
        this.name = name;
    }
    
    /**
     * Metode untuk merubah nomor telefon
     *
     * @param     phoneNumber
     * @return    void
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Metode untuk merubah lokasi
     *
     * @param     location
     * @return    void
     */
    public void setLocation(Location location){
        this.location = location;
    }
    
    /**
     * Metode untuk return lokasi
     *
     * @param     void
     * @return    location
     */
    public Location getLocation(){
        return location;
    }
    
    /**
     * Metode untuk print nama dari rekruter
     *
     * @param     void
     * @return    void
     */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = " + getLocation();
    }
}

