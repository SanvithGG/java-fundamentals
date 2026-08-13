package Conditionals;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amt = sc.nextInt();
        double discount=(amt>1000)?10:5;
        double finalbill = amt+(amt*discount/100);
        System.out.println("Total Amount is : " + amt);
        System.out.println("The Final amt is : " + finalbill);
        sc.close();
    }
}

