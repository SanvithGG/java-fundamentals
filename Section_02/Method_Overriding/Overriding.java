package Method_Overriding;

class Parent{
    public void marrage(){
        System.out.println("marry shrada kapoor");
    }
}

class Child extends Parent{
    @Override
    public void marrage(){
        System.out.println("marry sai pallivi");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.marrage();
        Parent p = new Parent();
        p.marrage();
    }
}
