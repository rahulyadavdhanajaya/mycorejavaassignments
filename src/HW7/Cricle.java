package HW7;

public class Cricle implements Shape {

    int pie=3;
    int radius= 56;


    @Override
    public int calculateArea() {
        return pie*radius*radius;
    }
}
