
/**
 * Write a description of class JWork here.
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */

import java.util.ArrayList;
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
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Nathan", "Nathan@gmail.com", "085813", location1));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "nathaniel", "nathanff@ui.ac.id", "nathanT123", 2021, 4, 22));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "faustine", "nathaniel.faustine@ui.ac.id", "nathanT123", 2021, 4, 23));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hansaka", "hansaka@ui.ac.id", "nathanT123", 2021, 3, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobSeeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(2, "Data Analyst Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(3, "Data Analyst Shopee", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataAnalyst));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));

        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));
        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));

        System.out.println("\n=====================Bonus Database====================\n");
        System.out.println(DatabaseBonus.getBonusDatabase());

        ArrayList<Job> myJob = new ArrayList<Job>();
        ArrayList<Job> myJob1 = new ArrayList<Job>();

        myJob.add(new Job(10, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        myJob1.add(new Job(11, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));

        Jobseeker jbs = new Jobseeker(1, "abc", "abc@gmail.com", "abc123");

        DatabaseInvoice.addInvoice(new BankPayment(9, myJob, jbs));
        DatabaseInvoice.addInvoice(new EwalletPayment(10, myJob, jbs));

        System.out.println("\n=====================Invoice Database====================\n");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());


    }
}
