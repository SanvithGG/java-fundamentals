import java.util.Scanner;

public class Iffactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m % n == 0) {
            System.out.println(n + " is factor of " + m);
        } else {
            System.out.println(n + " is not a  factor of " + m);
        }
        sc.close();
    }
}
