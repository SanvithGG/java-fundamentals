package Loops;

import java.util.Scanner;

public class DivisibleNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Enter the number to divide by: ");
        int num = sc.nextInt();

        System.out.println("Numbers divisible by " + num + ":");

        for (int i = start; i <= end; i++) {

            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
