package Method_Overloading;

public class Invoice {

    // Version 1
    public void issue(String custId, double monthlyRate) {

        System.out.println("Customer ID: " + custId);
        System.out.println("Monthly Rate: " + monthlyRate);
    }

    // Version 2
    public void issue(String custId, int hours, double hourlyRate) {

        System.out.println("Customer ID: " + custId);
        System.out.println("Hourly Rate: " + hourlyRate);

        double usage = hours * hourlyRate;

        System.out.println("Usage Amount: " + usage);
    }

    // Version 3
    public void issue(String custId, double baseFee, double discountPercentage) {

        System.out.println("Customer ID: " + custId);
        System.out.println("Base Fee: " + baseFee);
        System.out.println("Discount Percentage: " + discountPercentage);

        double discountAmount = baseFee * (discountPercentage / 100);

        double result = baseFee - discountAmount;

        System.out.println("Enterprise Invoice: " + result);
    }

    public static void main(String[] args) {

        Invoice obj = new Invoice();

        obj.issue("C101", 5000.0);

        obj.issue("C102", 10, 200.0);

        obj.issue("C103", 10000.0, 20.0);
    }
}