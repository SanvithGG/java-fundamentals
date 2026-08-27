package Constructor_chaining;
public class Mobilechain {
    public String brand;
    public double price;
    public String ram;
    public String rom;
    public String battery;

    public Mobilechain(String brand){
        this.brand=brand;
    }
    public Mobilechain(String brand,double price){
        this(brand);
        this.price=price;
    }
    public Mobilechain(String brand,double price,String ram){
        this(brand,price);
        this.ram=ram;
    }
    public Mobilechain(String brand,double price,String ram,String rom){
        this(brand,price,ram);
        this.rom=rom;
    }
    public Mobilechain(String brand,double price,String ram,String rom,String battery){
        this(brand,price,ram,rom);
        this.battery=battery;
    }
    public static void main(String[] args) {
        Mobilechain m = new Mobilechain("Realmi",24999, "8GB", "128GB", "5000 mAh");
        System.out.println(m.brand);
        System.out.println(m.price);
        System.out.println(m.ram);
        System.out.println(m.rom);
        System.out.println(m.battery);
    }
}
