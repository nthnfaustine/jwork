/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

public class Invoice
{
    // instance variables dari Invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor dari invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * metode untuk return id
     *
     * @param     void
     * @return    id
     */
    public int getId(){
        return id;
    }
    
    /**
     * metode untuk return job id
     *
     * @param     void
     * @return    job id
     */
    public int getIdJob(){
        return idJob;
    }
    
    /**
     * metode untuk return date
     *
     * @param     void
     * @return    date
     */
    public String getDate(){
        return date;
    }
    
    /**
     * metode untuk return total fee
     *
     * @param     void
     * @return    total fee
     */
    public int getTotalFee(){
        return totalFee;
    }
    
    /**
     * metode untuk merubah id
     *
     * @param     id
     * @return    void
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * metode untuk merubah job id
     *
     * @param     idJobs
     * @return    void
     */
    public void setIdJobs(int idJobs){
        this.idJob = idJobs;
    }
    
    /**
     * metode untuk merubah date
     *
     * @param     date
     * @return    void
     */
    public void setDate(String date){
        this.date = date;
    }
    
    /**
     * metode untuk merubah totalfee
     *
     * @param     totalFee
     * @return    void
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    /**
     * metode untuk return jobseeker
     *
     * @param     void
     * @return    jobseeker
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    
    /**
     * metode untuk merubah jobseeker
     *
     * @param     jobseeker
     * @return    void
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    
    public void printData(){
        System.out.println(getName());
    }
}
