package Interface;

interface Vehicle {
    public static final String COLOR = "red";

    void run();
}

class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}

public class Interfce {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        System.out.println(Vehicle.COLOR);
    }
}

