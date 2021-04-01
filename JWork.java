
/**
 * Write a description of class JWork here.
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */
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
        
        Jobseeker myjobseeker = new Jobseeker(99, "bebas", "bebas@gmail.com", "rahasia", "27/3/2020");
        
        Bonus myBonus = new Bonus(2, "myBonus", 10000, 1, true);
        
        Bonus myBonus2 = new Bonus(2, "myBonus2", 10000, 10000000, true);
        
        EwalletPayment pertama = new EwalletPayment(222, myJob, "1/4/2020", myjobseeker, InvoiceStatus.Ongoing);
        
        EwalletPayment dua = new EwalletPayment(223, myJob, "1/4/2020", myjobseeker, InvoiceStatus.Ongoing, myBonus);
        
        EwalletPayment tiga = new EwalletPayment(224, myJob, "1/4/2020", myjobseeker, InvoiceStatus.Ongoing, myBonus2);
        
        pertama.printData();
        dua.printData();
        tiga.printData();
        
    }
}
