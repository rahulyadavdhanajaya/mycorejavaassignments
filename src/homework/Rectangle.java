package homework;

public class Rectangle extends Shape{

    int length;

    int width;

    @Override
    int getArea(int length, int width) {
        return length*width;
    }
}
