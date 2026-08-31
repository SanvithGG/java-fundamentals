package Encapsulation.Example_6;

class Test{

    public String brand;
    public double price;
    private String ram;
    private String rom;
    private String battery;
    private String processor;

    public Test(String brand , double price){
        this.brand = brand;
        this.price = price;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}

public class Mobile {
    public static void main(String[] args) {
        Test t = new Test("Samsung" , 20000);
        t.setRam("6GB");
        t.setRom("128GB");
        t.setBattery("5000mAh");
        t.setProcessor("Snapdragon");
        System.out.println("Brand: " + t.brand); 
        System.out.println("Price: " + t.price);
        System.out.println("Ram: " + t.getRam());
        System.out.println("Rom: " + t.getRom());
        System.out.println("Battery: " + t.getBattery());
        System.out.println("Processor: " + t.getProcessor());
    }
}
