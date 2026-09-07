package Method_Overriding;

class Bank{
    public  void homeLoan(double amt){
        System.out.println("--------------");
    }
}

class SBI extends Bank{
    @Override 
    public  void homeLoan(double amt){
        double intrest = (amt*14)/100;
        System.out.println("loan at 14% intrest......so your intrest for the "+amt+" is "+intrest);
    }
} 

class HDFC extends Bank{
        @Override 
    public  void homeLoan(double amt){
        double intrest = (amt*10)/100;
        System.out.println("loan at 10% intrest......so your intrest for the "+amt+" is "+intrest);
    }
}

class ICICI extends Bank{
        @Override 
    public  void homeLoan(double amt){
        double intrest = (amt*17)/100;
        System.out.println("loan at 17% intrest......so your intrest for the "+amt+" is "+intrest);
    }
}

public class Overbank {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.homeLoan(200000);
        HDFC h = new HDFC();
        h.homeLoan(300000);
        ICICI i = new ICICI();
        i.homeLoan(100000);

    }
}
