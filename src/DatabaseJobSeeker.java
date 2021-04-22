import java.util.ArrayList;

public class DatabaseJobSeeker {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) {
        Jobseeker x = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                x = jobseeker;
            }
        }
        return x;
    }

    public static boolean addJobseeker(Jobseeker jobseeker) {
        boolean result = false;
        if (JOBSEEKER_DATABASE.size() == 0){
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getId();
            result = true;
            return result;
        }
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (jobseeker.getEmail().equals(JOBSEEKER_DATABASE.get(i).getEmail())) {
                System.out.println("Email has been registered");
                result = false;
                return result;
            } else {
                JOBSEEKER_DATABASE.add(jobseeker);
                lastId = jobseeker.getId();
                result = true;
                return result;
            }

        }
        return result;
    }

    public static boolean removeJobseeker(int id) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        return false;
    }
}
