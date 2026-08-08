import java.util.Scanner;

public class ElseCommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of total bill amount");
        double finalbill = sc.nextDouble();
        if (finalbill < 1000) {
            System.out.println("No Discount applies");
        } 
        else if (finalbill > 1000 && finalbill < 5000) {
            System.out.println("your discount is 5%");
            finalbill =finalbill - finalbill * 5 / 100;
        }
         else if (finalbill > 5000 && finalbill < 10000) {
            System.out.println("your discount is 10%");
            finalbill = finalbill - finalbill * 10 / 100;
        } 
        else {
            System.out.println("Your discount is 20%");
            finalbill = finalbill - finalbill * 20 / 100;   
        }
        System.out.println("Your final bill after discount  is " + finalbill);
        sc.close();
    }
}
