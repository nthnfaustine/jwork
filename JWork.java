
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        Job myJob = new Job(1, "Pekerjaan", myRecruiter, 10000, "Tech");
        
        Jobseeker myJobseeker = new Jobseeker(1, "bukannathan", "bukannathan@example.com", "password123", "18 Maret 2021");
        
        Invoice jobInvoice = new Invoice(1, 11, "18 Maret 2021", 10000, myJobseeker);
        
        System.out.println(myRecruiter.getName());
        
        myRecruiter.setName("fff");
        
        System.out.println(myRecruiter.getName());
        
        myJob.printData();
        
    }
}
