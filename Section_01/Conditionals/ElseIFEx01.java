package Conditionals;

import java.util.Scanner;

/**
 * ElseIFEx01
 */
public class ElseIFEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed the driver is travelling");
        int speed = sc.nextInt();

        if (speed > 0 && speed <= 50) 
        {
            System.out.println("safe driving! no fine");
        }
         else if (speed >= 51 && speed <= 70) 
        {
            System.out.println("Minor Speeding. Fine: â‚¹2,000");
        }
         else if (speed >= 71 && speed <= 90) 
        {
            System.out.println("Moderate Speeding. Fine : â‚¹5,000 ");
        }
         else 
        {
            System.out.println("Reckless driving! Fine: 10000 and license suspended.");
        }

        sc.close();
    }
}


