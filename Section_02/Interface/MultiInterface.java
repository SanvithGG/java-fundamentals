package Interface;

interface Vehicle {
    void run();
}

class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}

class Plane implements Vehicle {
    @Override 
    public void run() {
        System.out.println("Plane is running");
    }
}

public class MultiInterface {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        Plane p = new Plane();
        p.run();
    }
}
