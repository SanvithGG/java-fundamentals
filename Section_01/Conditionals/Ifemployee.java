package Conditionals;

import java.util.Scanner;

/**
 * Ifemployee
 */
public class Ifemployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of projects u have completed");
        int p=sc.nextInt();
        if (p>=5) {
            System.out.println("You are eligible for Hike");
        }
        else{
            System.out.println("You are not eligible for Hike");
        }
        sc.close();
    }
}
