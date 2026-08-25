import java.util.Scanner;

public class Circledtic {

    static double pie;

    static {
        pie = 3.14;
    }

    public int radius;

    {
        System.out.println("Enter the radius");
    }

    public static void area(double radius) {
        double area = pie * radius * radius;
        System.out.println("Area is: " + area);
    }

    public static void circum(double radius) {
        double circum = 2 * pie * radius;
        System.out.println("Circumference is: " + circum);
    }

    public static void diamet(double radius) {
        double diamet = 2 * radius;
        System.out.println("Diameter is: " + diamet);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circledtic c1 = new Circledtic();

        c1.radius = sc.nextInt();

        area(c1.radius);
        circum(c1.radius);
        diamet(c1.radius);
        sc.close();
    }
}