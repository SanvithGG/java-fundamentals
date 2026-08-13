package Conditionals;

// 6. Write a program to print the final electricity bill after applying tax using the following conditions:

// Bill > â‚¹1,00,000 â†’ 22% tax

// Bill between â‚¹50,000 and â‚¹1,00,000 â†’ 12% tax

// Bill between â‚¹20,000 and â‚¹50,000 â†’ 8% tax

// Bill < â‚¹20,000 â†’ No tax

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill");
        int bill=sc.nextInt();
        int tax =(bill>=100000)?22:(bill>=50000 && bill<=100000)?12:(bill>=20000 && bill<=50000)?8:0;
        int finalBill=bill+(bill*tax/100);
        System.out.println("the final amount with " +tax+ " is : "+finalBill);
        sc.close();
    }
}

