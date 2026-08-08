import java.util.Scanner;

/**
 * bills
 */
public class Bills_input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Bill amount");
        double bill = sc.nextDouble();

        System.out.println("Enter the discount percentage");
        double discount = sc.nextDouble();
        System.out.println("Enter the value of gst");
        double gst =sc.nextDouble();
        double gst_amount;
        double finalAmount;
        double discount_price;

        discount_price = bill - (bill * discount / 100.0);
        gst_amount =(discount_price * gst / 100.0);
        finalAmount = discount_price - gst_amount;

        System.out.println(bill);
        System.out.println(discount);
        System.out.println(gst);
        System.out.println(finalAmount);

        sc.close();
    }
}
