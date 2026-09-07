package Inheritance.Hirarcy_inheritance;

class Cup {

    public void holdLiquid() {
        System.out.println("Cup can hold liquid");
    }
}

class PlasticCup extends Cup {

    public  void flexible() {
        System.out.println("Plastic cup is flexible");
    }
}

class GlassCup extends Cup {

    public  void transparent() {
        System.out.println("Glass cup is transparent");
    }
}

public class Hierarchy1 {

    public static void main(String[] args) {

        PlasticCup plastic = new PlasticCup();

        plastic.holdLiquid();
        plastic.flexible();

        System.out.println();

        GlassCup glass = new GlassCup();

        glass.holdLiquid();
        glass.transparent();
    }
}