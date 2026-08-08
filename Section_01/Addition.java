import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for A");
        int a=sc.nextInt();
        System.out.println("Enter the value for B");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of a and b is " + sum);
        sc.close();
    }
}
