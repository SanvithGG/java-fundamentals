package Methods;

import java.util.Scanner;

public class billsmet {

    public static double bill(int amount) {

        double discount;

        if (amount >= 20000) {
            discount = amount * 25 / 100.0;
        } 
        else if (amount >= 10000 && amount<=19999) {
            discount = amount * 12 / 100.0;
        }
        else if (amount >= 5000 && amount<=9999) {
            discount = amount * 6 / 100.0;
        }
        else if (amount >= 2000 && amount<=4999) {
            discount = amount * 3 / 100.0;
        } 
        else {
            discount = 0;
        }

        return amount - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bill amount");
        int a = sc.nextInt();

        double total = bill(a);

        System.out.println("Total bill after discount = " + total);
        sc.close();
    }
}

// so make a discount calculating method which returns the total bill amt after deducting the discount
//    20k > 25% discount
//    10k to 19.999 12%