// write a program to check whether a person is eligible to vote or not

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=sc.nextInt();
        String eligible=(age>18)?"Eligible to vote":"Not Eligible to vote";
        System.out.println(" you are "+eligible);
        sc.close();
    }
}



 