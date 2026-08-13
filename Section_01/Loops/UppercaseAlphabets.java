package Loops;

public class UppercaseAlphabets {

    public static void main(String[] args) {

        // Using For Loop
        System.out.println("Using For Loop:");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // Using While Loop
        System.out.println("Using While Loop:");

        char ch = 'A';

        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println();

        // Using Do-While Loop
        System.out.println("Using Do-While Loop:");

        ch = 'A';

        do {
            System.out.print(ch + " ");
            ch++;
        } while (ch <= 'Z');
    }
}
