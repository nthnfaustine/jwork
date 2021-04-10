import java.text.SimpleDateFormat;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EwalletPayment extends Invoice{
    
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker,InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker,InvoiceStatus invoiceStatus, Bonus bonus){
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee(){
        if((bonus != null) && (bonus.getActive() == true) && (getJob().getFee() > bonus.getMinTotalFee())){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } else {
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus(){
        return bonus;
    }
    
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + date);
        System.out.println("Job Seeker: " + getJobseeker().getName());
        
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()){
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
        return "";
    }
}
