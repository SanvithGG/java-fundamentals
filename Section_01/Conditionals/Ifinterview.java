package Conditionals;

import java.util.Scanner;

public class Ifinterview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage");
        double per=sc.nextDouble();
        if (per>60) {
            System.out.println("your "+per+"% meet the requeriment");
        }
        else{
            System.out.println("your "+per+"%  Does not meet the requeriment");
        }
        sc.close();
    }
}

