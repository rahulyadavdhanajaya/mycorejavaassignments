package HW7.HW11.HW12;
//Create a class called Person that has private variables name, age, and address.
//        Create public methods to access and modify these variables, such as getName(), getAge(), getAddress(), setName(), setAge(), and setAddress().
//        Make sure that the age variable can only be set to a value between 0 and 120.
public class Main {
    public static void main(String[] args) {
        Person p= new Person();
        p.setName("rahul");
        p.setAge((short) 30);
        p.setAddress("corners street");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getAddress());

    }
}
