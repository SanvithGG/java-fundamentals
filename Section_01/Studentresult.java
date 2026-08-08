import java.util.Scanner;

public class Studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject mark");
        int m1 = sc.nextInt();

        String result = (m1 > 35) ? "PASSED"
                : "FAILED MAN DONT WORRY ITS A SURPRISE TEXT TRY NOT TO REPEAT THIS IN IF U KNOW YOU KNOW !";

        System.out.println(result);
        sc.close();
    }
}
