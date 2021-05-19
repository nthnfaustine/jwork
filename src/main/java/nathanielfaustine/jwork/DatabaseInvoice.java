package nathanielfaustine.jwork;
import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice x = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                x = invoice;
                return x;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerid == invoice.getJobseeker().getId()) {
                temp.add(invoice);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.Ongoing | invoicee.getId() == invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}