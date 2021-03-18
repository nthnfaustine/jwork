/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

public class Job
{
    // instance variables dari class Job
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;

    /*
     Constructor dari class Job
    */
    public Job(int id, String name, Recruiter recruiter, int fee, String category){
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
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
     * @return    nama
     */
    public String getName(){
        return name;
    }
    
    /**
     * Metode untuk return fee
     *
     * @param     void
     * @return    fee
     */
    public int getFee(){
        return fee;
    }
    
    /**
     * Metode untuk return kategori job
     *
     * @param     void
     * @return    kategori
     */
    public String getCategory(){
        return category;
    }
    
    /**
     * Metode untuk return rekruter
     *
     * @param     void
     * @return    rekruter
     */
    public Recruiter getRecruiter(){
        return recruiter;
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
     * Metode untuk merubah nama job
     *
     * @param     nama
     * @return    void
     */
    public void setName(String name){
       this.name = name;
    }
    
    /**
     * Metode untuk merubah rekruter
     *
     * @param     rekruter
     * @return    void
     */
    public void setRecruiter(Recruiter recruiter){
       this.recruiter = recruiter;
    }
    
    /**
     * Metode untuk merubah fee
     *
     * @param     fee
     * @return    void
     */
    public void setFee(int fee){
        this.fee = fee;
    }
    
    /**
     * Metode untuk merubah kategori job
     *
     * @param     kategori
     * @return    void
     */
    public void setCategory(String category){
        this.category = category;
    }
    
    public void printData(){
        
    }
}
