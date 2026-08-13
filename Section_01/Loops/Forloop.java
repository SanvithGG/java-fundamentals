package Loops;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and the end value");
        int i=sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the numbers from the "+i+" to " +b+ "is :");
        for(; i<=b; i++)
        {
            System.out.println(i);
        }
        sc.close();
    }
}

