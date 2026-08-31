package Encapsulation.Example_5;

 class Test {

    public int id;
    public String eName;
    private double  salary;
    private String designition;
    private int noOfProjects;

    public Test(String eName , int id){
        this.eName = eName;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignition() {
        return designition;
    }

    public void setDesignition(String designition) {
        this.designition = designition;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

 }

public class Employee {
    public static void main(String[] args) {
        Test t1 = new Test("sanvith", 101);
        t1.setSalary(100000.0);
        t1.setDesignition("Software Engineer");
        t1.setNoOfProjects(20);

        System.out.println("Employee name is :"+t1.eName);
        System.out.println("Employee id is :"+t1.id);
        System.out.println("Employee salary is :"+t1.getSalary());
        System.out.println("Employee designition is :"+t1.getDesignition());
        System.out.println("Employee number of projects is :"+t1.getNoOfProjects());
    }
}
