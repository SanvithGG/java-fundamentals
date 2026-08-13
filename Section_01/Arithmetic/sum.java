package Arithmetic;

// write a program to print the sum of digits in a given number 

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();

        int sum = 0;
        while (a != 0) {
            int digits = a % 10;
            sum += digits;
            a = a / 10;
        }
        System.out.println("the sum of digit is " + sum);
        sc.close();
    }
} 


