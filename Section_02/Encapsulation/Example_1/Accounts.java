package Encapsulation.Example_1;

public class Accounts {

    private final  long accNo;
    public String acchrName;
    private long phoneNo;
    private double balance;

    Accounts(String acchrName){
        this.acchrName=acchrName;
        accNo =((long)(Math.random()*99999999l));
    }

    public long getAccNo() {
        return accNo;
    }

    public String getAcchrName() {
        return acchrName;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public double getBalance() {
        return balance;
    }

        public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}