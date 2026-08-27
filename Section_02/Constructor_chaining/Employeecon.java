package Constructor_chaining;
public class Employeecon {
    public int id;
    public String name;
    public double salary;
    public String role;

    public Employeecon(int id){
        this.id=id;
    }
    public Employeecon(int id,String name){
        this(id);
        this.name=name;
    }
    public Employeecon(int id,String name,double salary){
        this(id,name);
        this.salary=salary;
    }
    public Employeecon(int id,String name,double salary,String role){
        this(id,name,salary);
        this.role=role;
    }
    public static void main(String[] args) {
        Employeecon e = new Employeecon(1, "kirna", 343434, "Engenneer");
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.role);
    }
}
