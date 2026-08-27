package Constructor_chaining;
/**
 * Studentchaincon
 */
public class Studentchaincon {

    public String name;
    public int age;
    public char gender;

    public Studentchaincon(String name){
        this.name=name;
    }
    public Studentchaincon(String name,int age){
        this(name);
        this.age=age;
    }
    public Studentchaincon(String name,int age,char gender){
        this(name,age);
        this.gender=gender;
    }
    
    public static void main(String[] args) {
        Studentchaincon s = new Studentchaincon("kirna",21,'f');
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.gender);
    }
}