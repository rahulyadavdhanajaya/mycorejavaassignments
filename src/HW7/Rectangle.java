package HW7;

public class Rectangle implements Shape{


    int length =5;
    int width=6 ;
    @Override
    public int calculateArea() {
        return length*width;
    }
}
