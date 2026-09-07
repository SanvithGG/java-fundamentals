package Type_Casting;

class Bank {
    public String ifscCode;
    public String address;

    public void saving() {
        System.out.println("Bank has a savings bank acc");
    }

    public void lending() {
        System.out.println("Bank can lend the loan to customer\n");
    }

}

class Sbi extends Bank {
    public void sbiService() {
        System.out.println(ifscCode);
        System.out.println(address);
        System.out.println("SBI provides the banking service");
    }
}

class Icici extends Bank {
    public void iciciService() {
        System.out.println(ifscCode);
        System.out.println(address);
        System.out.println("ICICI provides the banking service");
    }
}

public class Upcasting {
    public static void main(String[] args) {

        Bank b = new Sbi();
        b.saving();
        b.lending();
        b.ifscCode = "5675GHJGJK";
        b.address = "Banglere";

        Sbi s = (Sbi) b;
        s.saving();
        s.sbiService();
        s.lending();

        Bank s1 = new Icici();
        s1.saving();
        s1.lending();
        s1.ifscCode = "5675GHJGJK";
        s1.address = "Banglere";

        Icici i = (Icici) s1;
        i.saving();
        i.iciciService();
        i.lending();
    }
}
