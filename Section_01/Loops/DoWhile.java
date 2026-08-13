package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and the end value");
        int i = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the numbers from the " + i + " to " + b + "is :");
        do {
            System.out.println(i);
            i++;
        } while (i <= b);
        sc.close();
    }
}

