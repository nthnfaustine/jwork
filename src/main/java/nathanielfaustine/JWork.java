
/**
 * Write a description of class JWork here.
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */

package nathanielfaustine;

import nathanielfaustine.jwork.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("tangsel", "serpong", "deskripsi");
        Location location2 = new Location("tangkot", "serpong utara", "deskripsi");
        Location location3 = new Location("banten", "serpong selatan", "deskripsi");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Nathan", "Nathan@gmail.com", "085813", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Nathanfa", "Nathanfa@gmail.com", "0858134", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Nathanfaustin", "Nathanfaustin@gmail.com", "08581345", location3));

        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Data Analyst Tokopedia", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(3, "Data Analyst Shopee", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(4, "Frontend traveloka", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.UX));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);
    }

}
