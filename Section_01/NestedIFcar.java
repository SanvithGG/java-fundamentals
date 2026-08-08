import java.util.Scanner;

public class NestedIFcar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type (car/truck):");
        String vehicle = sc.next();

        System.out.println("Is it peak hour? (true/false)");
        boolean isPeakHour = sc.nextBoolean();

        if (vehicle.equals("car")) {

            if (isPeakHour) {
                System.out.println("Car toll is ₹100");
            } else {
                System.out.println("Car toll is ₹50");
            }

        } else if (vehicle.equals("truck")) {

            if (isPeakHour) {
                System.out.println("Truck toll is ₹250");
            } else {
                System.out.println("Truck toll is ₹150");
            }

        } else {
            System.out.println("Invalid Vehicle");
        }

        sc.close();
    }
}