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
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * Constructor dari invoice
     */
    public Invoice(
        int id,
        int idJob,
        String date,
        int totalFee,
        Jobseeker jobseeker,
        PaymentType paymentType,
        InvoiceStatus status){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
    
    public PaymentType getPaymentType(){
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return status;
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
    
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    
    public void setInvoiceStatus(InvoiceStatus status) {
        this.status = status;
    }
    
    public void printData(){
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " + date);
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + totalFee);
        System.out.println("Status: " + status);
    }
}
