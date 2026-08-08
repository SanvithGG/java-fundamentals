import java.util.Scanner;

public class Iflargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        if (num > num1) {
            System.out.println(num + " is grater than " + num1);
        } else {
            System.out.println(num1 + " is grater than " + num);
        }
        sc.close();
    }
}
