
// write a program for Laptop object
// create 5 Methods like browse,play,watch,coding,edit
// perform Methods chaining by calling a Method inside another Method

// main()--->Browse();
// Browse()--->play();
// play()--->watch();
// watch()--->coding();
// coding()--->edit();

package Methods;

public class Laptop {
    public static void Browse() {
        System.out.println("Browsing Internet");
        play();
    }

    public static void play() {
        System.out.println("Playing Games");
        watch();
    }

    public static void watch() {
        System.out.println("Watching Movies");
        coding();
    }

    public static void coding() {
        System.out.println("Coding");
        edit();
    }

    public static void edit() {
        System.out.println("Editing"); 
    }

    public static void main(String[] args) {
        Browse();  
    }

}
