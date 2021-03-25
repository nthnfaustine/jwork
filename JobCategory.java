
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */
public enum JobCategory {
    WebDeveloper("Web Developer"), FrontEnd("Front End"), BackEnd("Back End"), UI("UI"), UX("UX"), Devops("Devops"),
    DataScientist("Data Scientist"), DataAnalyst("Data Analyst");

    private String jobcategory;

    private JobCategory(String category) {
        this.jobcategory = category;

    }

    @Override
    public String toString() {
        return jobcategory;
    }

    public static void main(String[] args) {
        JobCategory webdev = JobCategory.WebDeveloper;
        JobCategory frontend = JobCategory.FrontEnd;
        JobCategory backend = JobCategory.BackEnd;
        JobCategory ui = JobCategory.UI;
        JobCategory ux = JobCategory.UX;
        JobCategory devops = JobCategory.Devops;
        JobCategory datsci = JobCategory.DataScientist;
        JobCategory datan = JobCategory.DataAnalyst;
        System.out.println(webdev);
        System.out.println(frontend);
        System.out.println(backend);
        System.out.println(ui);
        System.out.println(ux);
        System.out.println(devops);
        System.out.println(datsci);
        System.out.println(datan);

    }
}