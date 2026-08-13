package Conditionals;

// 4.write a program to implement acess permission for the employees
// conditions
// CEO --> add create remove read shange
// ADMIN-->read write remove
// DEV-->read write
// USER-->read

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter employee role:");
        String role = sc.nextLine().toUpperCase();

        switch (role) {
            case "CEO":
                System.out.println("Permissions: Add, Create, Remove, Read, Change");
                break;

            case "ADMIN":
                System.out.println("Permissions: Read, Write, Remove");
                break;

            case "DEV":
                System.out.println("Permissions: Read, Write");
                break;

            case "USER":
                System.out.println("Permissions: Read");
                break;

            default:
                System.out.println("Invalid role");
        }
        sc.close();
    }
}

