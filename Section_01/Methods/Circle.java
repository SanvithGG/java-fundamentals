package Methods;

import java.util.Scanner;

public class Circle {
    public static void Circ(double radius) {
        System.out.println("Circle Radius is :" + radius);
    }

    public static void area(double radius,double pi) {
        double area = pi * radius * radius;
        System.out.println("Area is :" + area);
    }

    public static void circum(double radius, double pi) {
        double circum = 2 * pi * radius;
        System.out.println("Circumference  is :" + circum);
    }

    public static void diamet(double radius) {
        double diamet = 2 * radius;
        System.out.println("diameter is :" + diamet);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle :");
        double radius = sc.nextDouble();
        double pi=31415;
        Circ(radius);
        area(radius,pi);
        circum(radius,pi);
        diamet(radius);
        sc.close();
    }
}

