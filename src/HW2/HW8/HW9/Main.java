package HW2.HW8.HW9;

public class Main {
    public static void main(String[] args) {
        Shape[] s= {new Rectangle(),new Cricle()};
        for(Shape shape:s ){
            int calculateArea= shape.calculateArea();
            System.out.println(calculateArea);
        }
    }
}
