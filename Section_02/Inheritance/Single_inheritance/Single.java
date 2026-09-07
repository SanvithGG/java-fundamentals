package Inheritance.Single_inheritance;

class cups{
    public static void Hold(){
        System.out.println("Its hold liquid");
    }
}
class coffeecup extends cups{
    public static void Serve(){
        System.out.println("This cup serve coffee");
    }
}

public class Single {
    public static void main(String[] args) {
        cups.Hold();

        coffeecup.Hold();
        coffeecup.Serve();
    }
}
