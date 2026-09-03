package Inheritance.Single_inheritance;

class bird{
    public static void fly()
    {
        System.out.println("Bird is flying");
    }
    public static void wings()
    {
        System.out.println("Bird is having wings");
    }


}
class Eagle extends bird{
    public static void hunt(){
        System.out.println("Eagle is hunting");
    }
}

public class Singleinh {
    public static void main(String[] args) {
        bird.fly();
        Eagle.hunt();
        Eagle.fly();
        Eagle.wings();
    }
}
