package HW2;

public class Mainvehicle {
    public static void main(String[] args) {
        Car car= new Car();
        Truck truck = new Truck();


        System.out.println(car.make());
        System.out.println(car.model());
        System.out.println(car.Drive());

        System.out.println(truck.make());
        System.out.println(truck.model());
        System.out.println(truck.Drive());
    }
}
