package Inhertence;

class vehiclee{
    String make;
    String model;
    int year;
    String fuelType;
    double fuelEfficiency;

    public vehiclee(String make, String model, int year, String fuelType,double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;

    }
    double getMaxSpeed(){
        return 0.0;
    }
    double calculateFuelEfficiency(){
        return 0.0;
    }
    double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}

class Truck extends vehiclee{
double CargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency,double CargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.CargoCapacity = CargoCapacity;
    }
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for trucks
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    public double getCargoCapacity() {
        return CargoCapacity;
    }

    public double getMaxSpeed() {
        return 80.0;
    }
}
class Carr extends vehiclee{
    double NumSeats;
    public Carr(String make, String model, int year, String fuelType, double fuelEfficiency,double Numseats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.NumSeats = Numseats;
    }
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for cars
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    public double getNumSeats() {
        return NumSeats;
    }
    public double getMaxSpeed() {
        return 120.0;
    }

}
class Motorcycle extends vehiclee{
    private double engineDisplacement;
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);

    }

    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for motorcycles
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }
    public double getMaxSpeed() {
        return 80.0;
    }
}


public class Q8Hierarchy {
    public static void main(String[] args) {

// Create instances of each vehicle type
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Carr car = new Carr("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

// Print the vehicle details and calculations
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
    }

