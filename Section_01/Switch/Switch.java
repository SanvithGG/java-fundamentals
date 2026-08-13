package Switch;

import java.util.Scanner;

/**
 * Switch
 */
public class Switch {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number from 0 to 6 for days :");
         int num=sc.nextInt();
         
         switch (num) {
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDENSDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("INVALID NUMBER PLEASE TRY AGAIN");
                break;
         }
         
         sc.close();
    }
}
