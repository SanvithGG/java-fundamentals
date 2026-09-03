package Inheritance.Multilevel_inheritance;

class Account{
    public void display(){
        System.out.println("Account");
    }
    public void debit(){
        System.out.println("Debit");
    }
}
class SavingsAccount extends Account{
    public void credit(){
        System.out.println("Credit");
    }
}
class CurrentAccount extends SavingsAccount{
    public void withdraw(){
        System.out.println("Withdraw");
    }
}

public class Multiple {
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        c.display();
        c.debit();
        c.credit();
        c.withdraw();

        SavingsAccount s = new SavingsAccount();
        s.display();
        s.debit();
        s.credit();

        Account a = new Account();
        a.display();
        a.debit();
    }
}
