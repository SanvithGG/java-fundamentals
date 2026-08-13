package Conditionals;

// write a progeam to calculate a fine imposed to regulate the trafic rules based on speed
//  speed<=60 no fine
//  between 61 to 80 100rs fine
//  between 81 to 120 1000rs
//  speed>120 5yrs improsenment

import java.util.Scanner;

public class Trafic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the speed of the vehicle");
         int speed = sc.nextInt();
         String fine=(speed<=60)?"0":(speed>60 && speed<80)?"100":(speed>81 && speed<120)?"120":"ur improsined for 5 years Enjoy !";
         System.out.println("The fine is "+fine);
         sc.close();
    }
}

