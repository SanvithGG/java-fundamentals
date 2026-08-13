package Conditionals;

import java.util.Scanner;

public class Ifstusent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks > 35) {
            System.out.println("passed");
        } else {
            System.out.println("Failed");
        }
        sc.close();
    }
}

