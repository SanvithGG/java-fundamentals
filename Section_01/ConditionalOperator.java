import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        String res=(a%2==0)?"even number":"odd number";
        System.out.println(a+" is "+res);
        sc.close();
    }
}
