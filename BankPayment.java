import java.text.SimpleDateFormat;

/**
 * Write a description of class BankPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice{
    
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    
    public BankPayment(int id, Job job, Jobseeker jobseeker,InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, Jobseeker jobseeker,InvoiceStatus invoiceStatus, int adminFee){
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }
    
    @Override
    public void setTotalFee(){
        if(adminFee != 0){
            super.totalFee = getJob().getFee() - adminFee;
        } else {
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee(){
        return adminFee;
    }
    
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        System.out.println("===================== BANK PAYMENT =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + date);
        System.out.println("Job Seeker: " + getJobseeker().getName());
        
        setTotalFee();
        System.out.println("Admin Fee: " + adminFee);
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
        return "";
    }
}
