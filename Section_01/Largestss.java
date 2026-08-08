import java.util.Scanner;

public class Largestss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int e =sc.nextInt();

        int largest = (a > b && a>c && a>d && a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>e && c>d)?c:(d>a && d>c && d>b && d>e)?d:e;
        System.out.println("largest out of 5 is :" + largest);
        sc.close();
    }
}
