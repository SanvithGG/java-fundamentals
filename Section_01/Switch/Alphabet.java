package Switch;

// 2.write a program to check whether given alphabet is a vowel or a consonenet
// using the switch statement
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel");
                break;

            default:
                System.out.println(ch + " is a consonant");
        }
        sc.close();
    }
}

