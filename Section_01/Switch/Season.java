package Switch;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = sc.next();
        switch (month) {
            // case "nov","dec","jan","feb":
            // System.out.println("Its the Winter Season ");
            // break;
            // case "mar","apr","may","jun":
            // System.out.println("Its the Summer Season");
            // break;
            // case "july","aug","sep","oct":
            // System.out.println("Its the Rainy Season");
            // break;
            // default:
            // System.out.println("INVALID enter correct month name");
            // break;

            case "nov":
            case "dec":
            case "jan":
            case "feb":
                System.out.println("Its the Winter Season ");
                break;

            case "mar":
            case "apr":
            case "may":
            case "jun":
                System.out.println("Its the Summer Season");
                break;

            case "july":
            case "aug":
            case "sep":
            case "oct":
                System.out.println("Its the Rainy Season");
                break;

            default:
                System.out.println("INVALID enter correct month name");
        }
        sc.close();
    }
}






