package lesson13.challangeone;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private String registrationNumber;

    public Vehicle(String make, String model, int year, String registrationNumber) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
    }

    public double getMaintenanceCost() {
        return 300.0; // Base maintenance cost for a generic vehicle
    }

    public String describe() {
        return make + " " + model + " " + year + "\nRegistration Number: " + registrationNumber;
    }
}
