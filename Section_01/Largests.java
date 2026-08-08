// WRITE A PROGRAM TO PRINT LARGEST NUMB AMONG THE 2 NUMBER ,>?M?>
import java.util.Scanner;

public class Largests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int largest=(a>b)?a:b;
        System.out.println("largest out of "+a+" and "+b+" is :" +largest);
        sc.close();
    }
}
