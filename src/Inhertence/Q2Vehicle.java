package Inhertence;

class Vehicle{
    void drive(){
        System.out.println("Driving a Vehical");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class Q2Vehicle {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        Car car = new Car();
        veh.drive();
        car.drive();
    }
}
