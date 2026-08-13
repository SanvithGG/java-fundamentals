package Conditionals;

// write a program to check wether triangle is a equilatral ,issosales or scelean triangle or not 

import java.util.Scanner;

public class ElseTri {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 3 sides of the Triangle : ");
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();

    if (a==b && b==c) {
        System.out.println("All sides are equal its a equilatral triangle");
    }
    else if (a==b || b==c) {
        System.out.println("2 sides are equal so its a issoscels triangle");
    }
    else {
        System.out.println("All sides are differnt so its a scelean triangle");
    }
    sc.close();
 }    
}

