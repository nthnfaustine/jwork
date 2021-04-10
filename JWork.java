
/**
 * Write a description of class JWork here.
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JWork
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class JWork
     */
    public JWork(){

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        Location myLocation = new Location("Banten", "Tangerang Selatan", "Tempat lahir");
        
        Recruiter myRecruiter = new Recruiter(11, "Nathaniel", "nathan@example.com", "123123123", myLocation);
        
        Job myJob = new Job(1, "Pekerjaan", myRecruiter, 10000, JobCategory.WebDeveloper);
        
        Jobseeker myjobseeker = new Jobseeker(99, "bebas", "bebas@gmail.com", "rahasia");
        
        Bonus myBonus = new Bonus(2, "myBonus", 10000, 1, true);
        
        Bonus myBonus2 = new Bonus(2, "myBonus2", 10000, 10000000, true);
        
        EwalletPayment pertama = new EwalletPayment(222, myJob, myjobseeker, InvoiceStatus.Ongoing);
        
        EwalletPayment dua = new EwalletPayment(223, myJob, myjobseeker, InvoiceStatus.Ongoing, myBonus);
        
        EwalletPayment tiga = new EwalletPayment(224, myJob, myjobseeker, InvoiceStatus.Ongoing, myBonus2);
        
        BankPayment test1 = new BankPayment(224, myJob, myjobseeker, InvoiceStatus.Finished);

        BankPayment test2 = new BankPayment(224, myJob, myjobseeker, InvoiceStatus.Finished, 12);
        
        tiga.toString();
        test2.toString();
        
        // Jobseeker myJobseeker = new Jobseeker(1, "Nathan", "nathan@ui.ac.id", "Nathan123", new GregorianCalendar(2020, 1, 21));
        // Jobseeker myJobseeker1 = new Jobseeker(2, "Faustine", "nathaniel@ui.ac.id", "Nathan123", 2021, 04, 2);
        // Jobseeker myJobseeker2 = new Jobseeker(3, "Nathaniel", "nathaniel@example.com", "fff123456");
        // System.out.println(myJobseeker.toString());
        // System.out.println(myJobseeker1.toString());
        // System.out.println(myJobseeker2.toString());
        
    }
}
