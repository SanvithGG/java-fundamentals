package Conditionals;

// 5. write a program to implement trafic signal simulation
// conditions
// red-->stop immeditly
// yellow-->be alert and be ready
// orange-->
// green-->lets go
// any-->Invalid

import java.util.Scanner;

public class Trafic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter traffic signal:");
        String signal = sc.nextLine().toLowerCase();

        switch (signal) {
            case "red":
                System.out.println("Stop immediately");
                break;

            case "yellow":
                System.out.println("Be alert and be ready");
                break;

            case "orange":
                System.out.println("Be alert");
                break;

            case "green":
                System.out.println("Let's go");
                break;

            default:
                System.out.println("Invalid signal");
        }
        sc.close();
    }
}

