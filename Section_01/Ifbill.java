import java.util.Scanner;

public class Ifbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill Amount");
        double bill=sc.nextDouble();
        if (bill>=10000) {
            System.out.println("you will get 20% Discount");
        }
        else{
            System.out.println("you will get 5% Discount");
        }
        sc.close();
    }
}
