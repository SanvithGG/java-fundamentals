package Methods;

public class reverse {

    public static int reve(int num) {

        if (num == 0) {
            return 0;
        }

        return (num % 10) * 10 + reve(num / 10);
    }

    public static void main(String[] args) {

        int result = reve(1234);
        System.out.println(result);
    }
}