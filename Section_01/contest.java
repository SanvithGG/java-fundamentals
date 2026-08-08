// write a progeam to check whether a person is eligible contest in number of legestlative assembly election or not (age>25)i

import java.util.Scanner;
public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=sc.nextInt();
        String eligible=(age>25)?"Eligible to legestlative assembly election":"Not Eligible to legestlative assembly election";
        System.out.println(" you are "+eligible);
        sc.close();

    }
}



