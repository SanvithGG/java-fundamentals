import java.util.Scanner;

public class Ifsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        if (num < num1) {
            System.out.println(num + " is Less than " + num1);
        } else {
            System.out.println(num1 + " is Less than " + num);
        }
        sc.close();
    }
}
