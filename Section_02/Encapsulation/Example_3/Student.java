package Encapsulation.Example_3;

 class Test {
    public String name;
    public int age;
    private int rollNo;
    private String course;
    private String email;
    private char grade;



    public Test(String name, int age){
        this.name = name;
        this.age = age;
    }
   
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}


public class Student {
    public static void main(String[] args) {
        Test s1 = new Test("John", 21 );

        s1.setRollNo(10);
        s1.setCourse("Mathematics");
        s1.setEmail("sanvithgowda63@gmail.com");
        s1.setGrade('A');


        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.getCourse());
        System.out.println("Email: " + s1.getEmail());
        System.out.println("Grade: " + s1.getGrade());

    }
}

