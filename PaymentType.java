
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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

    // Driver method
    public static void main(String[] args){
        PaymentType p1 = PaymentType.BankPayment;
        System.out.println(p1);
        PaymentType p2 = PaymentType.EwalletPayment;
        System.out.println(p2);
    }
}
