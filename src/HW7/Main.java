package HW7;

public class Main {
    public static void main(String[] args) {

        Shape[] shape= {new Rectangle(), new Cricle()};
        System.out.println(shape[0].calculateArea());
        System.out.println(shape[1].calculateArea());
}}
