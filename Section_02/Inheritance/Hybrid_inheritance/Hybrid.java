package Inheritance.Hybrid_inheritance;

class vehical{
    public static void start(){
        System.out.println("Start using the key");
    }
}

class Roadway extends vehical{
    public static void runs(){
        System.out.println("it runs on road");
    }
}

class car extends Roadway{
    public static void whell(){
        System.out.println("it is a 4 wheller");
    }
}

class Airway extends vehical{
    public static void fly(){
        System.out.println("it flyes");
    }
}

class  plane extends Airway{
    public static void port(){
        System.out.println("it uses the airport to land");
    }
}

class Subway extends vehical{
    public static void runs(){
        System.out.println("it runs on the water ");
    }
}

class ship extends Subway{
    public static void sails(){
        System.out.println("it sails on water");
    }
}

public class Hybrid {
    public static void main(String[] args) {
       
        vehical.start();

        Roadway.start();
        Roadway.runs();

        car.start();
        car.runs();
        car.whell();

        Airway.start();
        Airway.fly();

        plane.start();
        plane.fly();
        plane.port();

        Subway.start();
        Subway.runs();

        ship.start();
        ship.runs();
        ship.sails();   



    }
}