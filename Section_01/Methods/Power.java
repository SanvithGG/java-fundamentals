package Methods;

import java.util.Scanner;

public class Power {

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bill amount");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the value is " + power(a,b));
        sc.close();
    }
}
