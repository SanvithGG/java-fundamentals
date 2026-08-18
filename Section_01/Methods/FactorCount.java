package Methods;

import java.util.Scanner;

public class FactorCount {

    public static void factor(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        System.out.println("Factor count = " + count);
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        factor(n);
        sc.close();
    }
}
