import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double largest=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("The largest among the 3 number is : "+largest);
        sc.close();
    }
}

// write a program to check whether a person is eligible to vote or not
// WRITE A PROGRAM TO PRINT LARGEST NUMB AMONG THE 2 NUMBER 
    // write a program to check whether a student is passed or failed in the exam 
// write a progeam to check whether a person is eligible contest in number of legestlative assembly election or not (age>25)
// write a program to print the smallest number among the 5 number

// write a program to print the final bill after tax imposition  bill>100000 22%tax bill in 
// bttween 50000 to 1 lakh 
// bill 20000 to 50000 
// bill less than 20000 no tax

// write a progeam to calculate a fine imposed to regulate the trafic rules based on speed
//  speed<=60 no fine
//  between 61 to 80 100rs fine
//  between 81 to 120 1000rs
//  speed>120 5yrs improsenment
