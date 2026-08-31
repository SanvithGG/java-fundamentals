package Encapsulation.Example_2;

public class User {
    public static void main(String[] args) {
        Instagram i = new Instagram("vishal");
        System.out.println(i.userName);
        i.setPassword("123456"); 
        i.setEmail("sanvith2005@gmail.com");
        i.setPhoneNo(1234567890l);
        System.out.println(i.getPassword());
        System.out.println(i.getEmail());
        System.out.println(i.getPhoneNo());
    }
}

