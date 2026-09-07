package Inheritance.Multilevel_inheritance;

class cups{
     public static void Hold(){
        System.out.println("Its hold liquid");
    }
}

class Plasticcup extends cups{
    public static void flexible(){
        System.out.println("they are flexible");
    }
}

class stellcups extends Plasticcup{
    public static void unbreakable(){
        System.out.println("Its less likily to break");
    }
}
public class multi1 {
    public static void main(String[] args) {
        cups.Hold();

        Plasticcup.Hold();
        Plasticcup.flexible();

        stellcups.Hold();
        stellcups.unbreakable();
        stellcups.flexible();
    }
}
