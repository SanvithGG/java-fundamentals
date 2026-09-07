package Method_Overloading;


public class areas {
    public void area(double r){
        double result = 3.1415 * r * r;
        System.out.println("The area of the circle is "+result); 
    }
    public void area(int l,int b){
        double result = l*b;
        System.out.println("The area of the Reactangle is "+result); 
    }
    public void area(int s){
        double result = s*s;
        System.out.println("The area of the circle is "+result); 
    }

    public static void main(String[] args) {
        areas a = new  areas();
        a.area(2);
        a.area(4.0);
        a.area(3, 4);
    }
}
