
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Nathaniel Faustine
 * @version 25/3/2021
 */
public enum PaymentType {
    BankPayment {
        @Override
        public String toString(){
            return "Bank Payment";
        }
    },
    EwalletPayment {
        @Override
        public String toString(){
            return "E-wallet Payment";
        }
    };
}
