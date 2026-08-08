import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num>0) {
            System.out.println("its a posituve number");
        }
        else{
            System.out.println("its a negatuve number");
        }
        sc.close();
    }
}
