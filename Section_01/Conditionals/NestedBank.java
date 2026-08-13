package Conditionals;

import java.util.Scanner;

public class NestedBank {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Month Salary");
         double Salary=sc.nextDouble();
         System.out.println("Enter your credit score");
         int creditscore=sc.nextInt();
         System.out.println("Enter the months active");
         int monthsactive=sc.nextInt();
         
            if (monthsactive>6) {
                if (Salary>=500000 && creditscore>=650) {
                        System.out.println("The loan is approved ");
                    }
                else if (Salary>=100000 && Salary<500000 && creditscore>=720) {
                        System.out.println("THE LOAN IS APPROVED ");
                    }
                else{
                System.out.println("Denied : Low sales volume");
                    }
                }
            else{
                    System.out.println("THE LOAN APPORVAL IS DENIED");
                }
        sc.close();
    
}
}



