package Switch;

// 1.write a program to implement a simple calculator by using a 2 simple number
// and operator as the input by the user

import java.util.Scanner;

/**
 * Calculator
 */
 class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operation you want to perform");
            char symbol=sc.nextLine().charAt(0);
            System.out.println("Enter any 2  number");
            int a =sc.nextInt();
            int b=sc.nextInt();

            switch (symbol) {
                case '+':
                    int c=a+b;
                    System.out.println("The Addition of "+a+" and "+b+" is : "+c);
                    break;

                case '-':
                    int d=a-b;
                    System.out.println("The Substraction of "+a+" and "+b+" is : "+d);
                    break;

                case '*':
                    int e=a*b;
                    System.out.println("The MUltiplication of "+a+" and "+b+" is : "+e);
                    break;
                
                 case '/':
                    int f=a/b;
                    System.out.println("The Divison of "+a+" and "+b+" is : "+f);
                    break;
                
                case '%':
                    int g=a%b;
                    System.out.println("The Addition of "+a+" and "+b+" is : "+g);
                    break;
                default:
                    System.out.println("Enter the valid operator or value and try again");
                    break;
            }
            sc.close();
        }
}
