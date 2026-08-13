package Conditionals;

import java.util.Scanner;

public class Nestedleap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();
        if (year%100==0) {
            System.out.println("Its a century year");
            if (year%400==0) {
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
        else
        {
            System.out.println("Its is not a century year");
            if (year%4==0) {
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
        sc.close();
    }
}

