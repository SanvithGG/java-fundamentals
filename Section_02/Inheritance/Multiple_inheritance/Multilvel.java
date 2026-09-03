package Inheritance.Multiple_inheritance;

interface Camera {
    default void pic() {
        System.out.println("taking the picture");
    }
}

interface MusicPlayer {
    default void play() {
        System.out.println("play the music");
    }
}

interface calculator {
    default void calculate() {
        System.out.println("calculate the numbers");
    }
}

class Mobile implements Camera, MusicPlayer, calculator {
    public void browsing() {
        System.out.println("browsing the internet");
    }
}

public class Multilvel {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();
        m1.pic();
        m1.play();
        m1.calculate();
        m1.browsing();
    
    }
}
