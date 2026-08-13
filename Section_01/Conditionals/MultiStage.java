package Conditionals;

import java.util.Scanner;

public class MultiStage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tire of the block");
        String tire=sc.next();
        System.out.println("Enter the base price");
        int baseprice=sc.nextInt();

        switch (tire) {
            case "Bronze":
                    System.out.println("Bronce : Apply A flat 5% discount");
                break;
            case "Silver":
                    System.out.println("Silver : Apply A flat 10% discount");
                break;
            case "Gold":
                
                if (baseprice>500) {
                    System.out.println("Apply 20% discount");
                }
                else{
                    System.out.println("Apply A flat 15% discount");
                    }
                break;
            default:
                System.out.println("No discount "+baseprice);
                break;
        }
        sc.close();
    }
}

