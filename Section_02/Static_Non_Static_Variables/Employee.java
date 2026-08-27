package Static_Non_Static_Variables;
public class Employee {
    public static String comp_name = "TCS";
    public static String work_loc = "Banglore";
    public static String Nationality = "Indian";
    public String Emp_name;
    public String Gender;
    public int salary;
    public String department;

    public static void main(String[] args) {

        System.out.println("Employee details of the Sanvith");

        Employee e1 = new Employee();
        e1.Emp_name = "sanvith";
        e1.Gender = "Male";
        e1.salary = 20000;
        e1.department = "IT department";

        System.out.println(e1.Emp_name);
        System.out.println(e1.Gender);
        System.out.println(comp_name);
        System.out.println(work_loc);
        System.out.println(Nationality);
        System.out.println(e1.salary);
        System.out.println(e1.department);

        System.out.println("\nEmployee details of the Sathwik");
        Employee e2 = new Employee();
        e2.Emp_name = "Sathwik";
        e2.Gender = "Male";
        e2.salary = 25000;
        e2.department = "FInance department";

        System.out.println(e2.Emp_name);
        System.out.println(e2.Gender);
        System.out.println(comp_name);
        System.out.println(work_loc);
        System.out.println(Nationality);
        System.out.println(e2.salary);
        System.out.println(e2.department);

}
}