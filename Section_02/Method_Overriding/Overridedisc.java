package Method_Overriding;

class Discountengine {
    public void calculateDiscount(double amt) {
        double discountAmt = (amt * 5) / 100;
        System.out.println("Discounted price is " + discountAmt);
    }
}

class vipDiscount extends Discountengine {
    @Override
    public void calculateDiscount(double amt) {
        if (amt < 10000) {
            double discountAmt = (amt * 15) / 100;
            System.out.println("Discounted price is " + discountAmt);
        } else {
            double discountAmt = (amt * 20) / 100;
            System.out.println("Discounted price is " + discountAmt);
        }
    }
}

class Elitedisc extends Discountengine {
    @Override 
     public void calculateDiscount(double amt) {
        super.calculateDiscount(amt);
        double discountAmt = (amt * 25) / 100;
        double bonous = amt - discountAmt + 2000;
        System.out.println("Discounted price is " + discountAmt);
        System.out.println("The total amt with the discount is "+bonous);
    }
}

public class Overridedisc {
    public static void main(String[] args) {
        vipDiscount v = new vipDiscount();
        v.calculateDiscount(30000);
        Elitedisc e = new Elitedisc();
        e.calculateDiscount(20000);
    }
}
