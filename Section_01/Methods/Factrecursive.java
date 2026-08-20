package Methods;

public class Factrecursive {

    public static int facts(int a) {

        if (a == 0 || a == 1) {
            return 1;
        }

        return a * facts(a - 1);
    }

    public static void main(String[] args) {

        int result = facts(5);
        System.out.println("Factorial = " + result);
    }
}