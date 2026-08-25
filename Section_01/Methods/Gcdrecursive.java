package Methods;

public class Gcdrecursive {

    public static int factor(int a, int b) {

        if (b == 0) {
            return a;
        }

        return factor(b, a % b);
    }

    public static void main(String[] args) {

        int result = factor(12, 18);
        System.out.println("GCD = " + result);
    }
}