/**
 * bills
 */
public class bills {

    public static void main(String[] args) {
        double bill = 1000;
        double discount;
        double gst=12;
        double finalAmount;
        double gst_amt;

        discount = bill - (bill * 20 / 100.0);
        gst_amt=(discount * gst / 100.0);
        finalAmount = discount + gst_amt; 

    
        System.out.println(bill);
        System.out.println(discount);
        System.out.println(gst_amt);
        System.out.println(finalAmount);
    }
}
