package Loops;

import java.util.Scanner;

public class SumOfTwoNuminRnage{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Start Value: ");
        int n = sc.nextInt();

        System.out.print("Enter the End Value: ");
        int m = sc.nextInt();

        int sum = 0;

        for (int i = n; i <= m; i++) {
            sum = sum + i;
        } 

        System.out.println("Sum = " + sum);

        sc.close();

    }
}
