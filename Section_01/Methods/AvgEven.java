package Methods;

import java.util.Scanner;

public class AvgEven {

    public static int avg(int a, int b, int c, int d, int e) {
        int avges = a + b + c + d + e / 5;
        return avges;
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (avg(a, b, c, d, e) % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println(" odd number");
        }
        sc.close();
    }
}
