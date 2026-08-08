import java.util.Scanner;

/**
 * ElseifStudent
 */
public class ElseifStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 6 Subject marks");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int m6 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5 + m6;
        int percentage = total / 6;

        System.out.println("Your 1st Subject marks is : " + m1);
        System.out.println("Your 2st Subject marks is : " + m2);
        System.out.println("Your 3st Subject marks is : " + m3);
        System.out.println("Your 4st Subject marks is : " + m4);
        System.out.println("Your 5st Subject marks is : " + m5);
        System.out.println("Your 6st Subject marks is : " + m6);
        System.out.println("Yout total marks is : " + total + " out of 600");
        System.out.println("Your Aggrigate is : " + percentage);
        if (percentage >= 95) {
            System.out.println("Result : First Rank");
        } 
        else if (percentage >= 90) {
            System.out.println("Result : Second Rank");
        } 
        else if (percentage >= 70) {
            System.out.println("Result : First Class with Distinction");
        } 
        else if (percentage>=80) {
            System.out.println("Result : Distinction" );
        }
        else if (percentage >= 60) {
            System.out.println("Result : First Class");
        } 
        else if (percentage >= 45) {
            System.out.println("Result : Second Class");
        } 
        else if (percentage >= 35) {
            System.out.println("Result : PASS");
        } 
        else {
            System.out.println("Result : FAILED");
        }
        sc.close();
    }
}