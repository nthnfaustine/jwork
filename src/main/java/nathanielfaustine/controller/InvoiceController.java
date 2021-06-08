package nathanielfaustine.controller;

import nathanielfaustine.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Control for Invoice
 *
 * @author (Nathaniel Faustine)
 * @version (8-6-2021)
 */

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    // return all invoices
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice() {
        ArrayList<Invoice> invoice = null;

        invoice = DatabaseInvoice.getInvoiceDatabase();
        return invoice;
    }

    // return an invoice with specific id
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return invoice;
    }

    // return invoice by jobseeker id
    @RequestMapping("/jobseeker/{jobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
    }

    // delete an invoice by its id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        try {
            DatabaseInvoice.removeInvoice(id);
            return true;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    // change an invoice status (Ongoing, Finished, or Canceled)
    @RequestMapping(value = "invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    // create new BankPayment invoice
    @RequestMapping(value = "createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(integer));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }

    // create a new Ewallet payment invoice
    @RequestMapping(value = "createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(integer));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByRefferalCode(referralCode));
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }

}
