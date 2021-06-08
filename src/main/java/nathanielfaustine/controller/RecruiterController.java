package nathanielfaustine.controller;

import nathanielfaustine.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import static nathanielfaustine.jwork.DatabaseRecruiter.getRecruiterDatabase;

/**
 * Control for Recruiter
 *
 * @author (Nathaniel Faustine)
 * @version (8-6-2021)
 */

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    // return all recruiter
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return getRecruiterDatabase();
    }

    // return a recruiter by its id
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        return recruiter;
    }

    // add a new recruiter
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city) {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, new Location(province, city, description));

        try{
            DatabaseRecruiter.addRecruiter(recruiter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return recruiter;
    }
}
