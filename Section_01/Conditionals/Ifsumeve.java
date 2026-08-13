package Conditionals;

import java.util.Scanner;

public class Ifsumeve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("sum of "+a+" and "+b+" is "+sum);
        if (sum%2==0) {
            System.out.println(sum+" is an even number");
        }
        else{
            System.out.println(sum+" is an odd number");
        }
        sc.close();
    }
}

