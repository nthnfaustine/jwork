package nathanielfaustine.controller;

import nathanielfaustine.jwork.*;
import org.springframework.web.bind.annotation.*;
import static nathanielfaustine.jwork.DatabaseJobseekerPostgre.getJobseekerLogin;

/**
 * Control for Jobseeker
 *
 * @author (Nathaniel Faustine)
 * @version (8-6-2021)
 */

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    // hello world
    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    // get a jobseeker by its id
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    // register a new jobseeker
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password) {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    // login
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        return(getJobseekerLogin(email, password));
    }
}