package Methods;

import java.util.Scanner;

/**
 * Average
 */
public class Average {

    public static void Avg(double v,double w,double x,double y,double z)
    {
        double avg=(v+w+x+y+z)/5;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 5 Numbers");
        Avg(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        sc.close();
    }   
}