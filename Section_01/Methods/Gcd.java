package Methods;

import java.util.Scanner;

/**
 * Gcd
 */
public class Gcd {

    public static int factor(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        factor(a, b);
        System.out.println("GCD is " +factor(a,b));

        sc.close();
    }
}