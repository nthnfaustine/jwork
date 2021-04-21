
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
}