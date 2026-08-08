import java.util.Scanner;

public class Circle_input {
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the circle");
        int radius = sc.nextInt();

        double area;
        double curcumference;
        double diameter;
        area = 3.1415 * radius * radius;
        System.out.println("Area of the circle is = "+area);

        curcumference = 2 * 3.1415 * radius * radius;
        System.out.println("Curcumference of the circle is = "+curcumference);

        diameter = 2 * radius;
        System.out.println("Diameter of the circle is = "+diameter);
        sc.close();
    }
}
