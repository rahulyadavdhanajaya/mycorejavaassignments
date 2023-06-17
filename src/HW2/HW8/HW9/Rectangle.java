package HW2.HW8.HW9;

public class Rectangle extends Shape{

    int length=10;
    int width=12;

    @Override
    int calculateArea() {
        return length*width;
    }
}
