package Encapsulation.Example_1;

public class Test {
    public static void main(String[] args) {
        Accounts a = new Accounts("Sanvith");
        a.setBalance(20000);
        a.setPhoneNo(909099090);
        System.out.println("The account holder name is "+a.acchrName);
        System.out.println("The account no is "+a.getAccNo());
        System.out.println("The balance is"+a.getBalance());
        System.out.println("The phone number is "+a.getPhoneNo());
    }
}


