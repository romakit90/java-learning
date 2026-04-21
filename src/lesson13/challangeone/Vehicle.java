package lesson13.challangeone;

public class Vehicle {

    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public double getMaintenanceCost() {
        return 300.0; // Base maintenance cost for a generic vehicle
    }

    public String describe() {
        return "Vehicle: " + year + " " + make + " " + model;
    }
}
