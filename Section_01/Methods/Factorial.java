package Methods;

import java.util.Scanner;

public class Factorial {

     public static void Fact(double num) {
        double factorial=1;
        while (num>0) {
            factorial =factorial*num;
            num--;
        }
        System.out.println(factorial);
    }
    
    public static void Fact1(double num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        double a = sc.nextDouble();
        Fact(a);
        sc.close();
    }
}
