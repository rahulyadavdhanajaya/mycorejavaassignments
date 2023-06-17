package HW2.HW8;

public class Main {
    public static void main(String[] args) {
       Person[] p= {new Student(),new Teacher()};

       for(Person person:p){
           String greet= person.greet();
           System.out.println(greet);
       }
//        System.out.println(p[0].greet());
//        System.out.println(p[1].greet());
    }
}
