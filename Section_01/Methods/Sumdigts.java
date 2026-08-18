package Methods;

import java.util.Scanner;

public class Sumdigts {

    public static void sum(int a) {
        int temp = a;
        int sum = 0;
        while (temp > 0) {
            int dig = temp % 10;
            sum = sum + dig;
            temp = temp / 10;
        }
        System.out.println("Sum of digits of " + a + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
