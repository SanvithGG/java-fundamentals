package Methods;

public class Sumdigtsrec {

    public static int sumof(int temp) {
        if (temp == 0) {
            return 0;
        }

        int dig = temp % 10;
        temp = temp / 10;

        return dig + sumof(temp);
    }

    public static void main(String[] args) {
        int result = sumof(22);
        System.out.println(result);
    }
}