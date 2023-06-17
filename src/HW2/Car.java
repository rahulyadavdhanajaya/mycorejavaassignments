package HW2;

public class Car extends Vehicle{

    String Drive(){
        return "Drives at 45 MPH";
    }

    @Override
    public String make() {
        return "2022" ;
    }

    @Override
    public String model() {
        return "audi";
    }
}
