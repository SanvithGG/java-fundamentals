import java.util.Scanner;

public class average_innput {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of A");
        int a=sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        System.out.println("Enter the value of C");
        int c=sc.nextInt();
        System.out.println("Enter the value of D");
        int d=sc.nextInt();
        System.out.println("Enter the value of E");
        int e=sc.nextInt();

        int avg,total;

        total=a+b+c+d+e;

        avg=total/5;
        System.out.println("the total is "+total);
        System.out.println("The average is "+avg);
        sc.close();
    }
}
