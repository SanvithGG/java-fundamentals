package Conditionals;

import java.util.Scanner;

public class Ifvote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Candidate is eligible to vote");
        }
        else{
            System.out.println("Candidate is not eligible to vote");
        }
        sc.close();
    }
}

