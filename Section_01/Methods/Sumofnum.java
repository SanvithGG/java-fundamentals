package Methods;


public class Sumofnum {

    public static int evennum(int Start, int End) {
        if (Start > End) {
            return 0;
        } 
       return Start + evennum(Start + 1, End);
    }

    public static void main(String[] args) {
       int sum = evennum(1, 5);
        System.out.println(+sum);
    }
}
