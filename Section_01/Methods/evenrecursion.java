package Methods;

public class evenrecursion {
    public static void evennum(int Start, int End) {
        if (Start > End) {
            return;
        } else {
            if (Start % 2 == 0)
                System.out.println(Start);
                evennum(Start + 1, End);
        }
    }

    public static void main(String[] args) {
        evennum(1, 5);
    }
}
