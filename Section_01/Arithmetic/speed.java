package Arithmetic;

import java.util.Scanner;

public class speed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled in km/h :");
        double distance = sc.nextDouble();
        System.out.println("Enter the time taken in hrs : ");
        double time = sc.nextDouble();
          
        double speed = distance / time;

        System.out.println("The Speed is "+speed+" km/h");
        sc.close();
    }
}

