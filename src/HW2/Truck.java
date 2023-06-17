package HW2;

public class Truck extends Vehicle{
      public String Drive(){
        return "Drive at 60 MPH";
    }

    @Override
    public String make() {
        return "2020";
    }

    @Override
    public String model() {
        return "RAM";
    }
}
