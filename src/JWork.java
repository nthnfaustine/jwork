
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

        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "nathaniel", "nathanff@ui.ac.id", "nathanT123", 2021, 4, 22));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "faustine", "nathaniel.faustine@ui.ac.id", "nathanT123", 2021, 4, 23));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hansaka", "hansaka@ui.ac.id", "nathanT123", 2021, 3, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hansaka", "hansaka@ui.ac.id", "nathanT123", 2021, 3, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobSeeker.removeJobseeker(24);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(23);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(20);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(21);
        } catch (BonusNotFoundException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobSeeker.getDatabaseJobseeker());
//        DatabaseJob.addJob(new Job(1, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
//        DatabaseJob.addJob(new Job(2, "Data Analyst Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataAnalyst));
//        DatabaseJob.addJob(new Job(3, "Data Analyst Shopee", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataAnalyst));
//
//        System.out.println("\n=====================Job Database By Category====================\n");
//        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
//
//        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));
//        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "abc", 10, 1, false));
//
        System.out.println("\n=====================Bonus Database====================\n");
        System.out.println(DatabaseBonus.getBonusDatabase());

        ArrayList<Job> myJob = new ArrayList<Job>();
        ArrayList<Job> myJob1 = new ArrayList<Job>();

        try {
            myJob.add(new Job(10, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            myJob1.add(new Job(11, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(10, myJob, DatabaseJobSeeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(13, myJob1, DatabaseJobSeeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(14, myJob1, DatabaseJobSeeker.getJobseekerById(3)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }

//        System.out.println("\n=====================Invoice Database====================\n");
//        System.out.println(DatabaseInvoice.getInvoiceDatabase());
//
//        DatabaseInvoice.getInvoiceByJobseeker(1);


    }
}
