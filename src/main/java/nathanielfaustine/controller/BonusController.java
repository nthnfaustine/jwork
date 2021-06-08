package nathanielfaustine.controller;

import nathanielfaustine.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Control for Bonus
 *
 * @author (Nathaniel Faustine)
 * @version (8-6-2021)
 */

@RequestMapping("/bonus")
@RestController
public class BonusController {

    // request to return all bonuses
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus(){
        return(DatabaseBonus.getBonusDatabase());
    }
    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(
            @PathVariable String referralCode){
        return(DatabaseBonus.getBonusByRefferalCode(referralCode));
    }

    // request to add new bonus
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value="referralCode") String referralCode,
            @RequestParam(value="extraFee") int extraFee,
            @RequestParam(value="minTotalFee") int minTotalFee,
            @RequestParam(value="active") boolean active

    ){
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try{
            DatabaseBonus.addBonus(bonus);
        }
        catch(ReferralCodeAlreadyExistsException e){
            e.getMessage();
            return null;
        }
        return bonus;
    }
}