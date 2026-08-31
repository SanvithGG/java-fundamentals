package Encapsulation.Example_7;

class Test {
    public String username;
    private String password;
    private long mobileno;
    private String email;
    private int noOfOrders;

    public Test(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoOfOrders() {
        return noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders) {
        this.noOfOrders = noOfOrders;
    }
}

public class FlipKart {
    public static void main(String[] args) {
        Test t=new Test("raj");
        t.setPassword("1234");
        t.setMobileno(1234567890);
        t.setEmail("sanvithgowda63@gmail.com");
        t.setNoOfOrders(10);
        System.out.println("Username: "+t.username);
        System.out.println("Password: "+t.getPassword());
        System.out.println("Mobile Number: "+t.getMobileno());
        System.out.println("Email: "+t.getEmail());
        System.out.println("Number of Orders: "+t.getNoOfOrders());
    }

}