/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Invoice
{
    // instance variables dari Invoice
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor dari invoice
     */
    public Invoice(
        int id,
        Job job,
        Jobseeker jobseeker,
        InvoiceStatus invoiceStatus){
        this.id = id;
        this.job = job;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
        this.date = Calendar.getInstance();
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
    public Job getJob(){
        return job;
    }
    
    /**
     * metode untuk return date
     *
     * @param     void
     * @return    date
     */
    public Calendar getDate(){
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
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    
    public abstract PaymentType getPaymentType();
    
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
    public void setJob(Job job){
        this.job = job;
    }
    
    /**
     * metode untuk merubah date
     *
     * @param     date
     * @return    void
     */
    public void setDate(Calendar date){
        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /**
     * metode untuk merubah totalfee
     *
     * @param     totalFee
     * @return    void
     */
    public abstract void setTotalFee();
    
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
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    public abstract String toString();
}
