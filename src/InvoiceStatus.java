
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */
public enum InvoiceStatus {
    Ongoing {
        @Override
        public String toString(){
            return "Ongoing";
        }
    },
    Finished {
        @Override
        public String toString(){
            return "Finished";
        }
    },
    Cancelled {
        @Override
        public String toString(){
            return "Cancelled";
        }
    };
}
