package Constructor_chaining;
public class Accountscon {
    public int accno;
    public String acchrname;
    public double balance;
    public String IFSC;

    public Accountscon(int  accno){
        this.accno=accno;
    }
    
    public Accountscon(int  accno,String acchrname){
        this(accno);
        this.acchrname=acchrname;
    }
    public Accountscon(int  accno,String acchrname,double balance){
        this(accno,acchrname);
        this.balance=balance;
    }
    public Accountscon(int  accno,String acchrname,double balance,String IFSC){
        this(accno,acchrname,balance);
        this.IFSC=IFSC;
    }

    public static void main(String[] args) {
        Accountscon a = new Accountscon(1293482094, "Kiran", 43434343, "HDFC0003451");
        System.out.println(a.accno);
        System.out.println(a.acchrname);
        System.out.println(a.balance);
        System.out.println(a.IFSC);
    }
}
