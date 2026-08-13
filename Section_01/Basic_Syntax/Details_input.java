package Basic_Syntax;

import java.util.Scanner;

public class Details_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your Age : ");
        byte age = sc.nextByte();

        System.out.println("Enter your Gender : ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your salary");
        short salary = sc.nextShort();

        System.out.println("Enter the Department : ");
        String department = sc.nextLine();

        System.out.println("Enter your Email id : ");
        String emailid = sc.nextLine();

        System.out.println("Enter the totol Number of your experience : ");
        String experience = sc.nextLine();

        System.out.println("Name of the employee is : " + name);
        System.out.println("Age of the employee is : " + age);
        System.out.println("Gender of the employee is : " + gender);
        System.out.println("Salary of the employee is : " + salary);
        System.out.println("The department of the employee is : " + department);
        System.out.println("The Email address of the employee is : " + emailid);
        System.out.println("The Total Number of the Experience Employee has is : " + experience);

        sc.close();
    }
}

