package lesson13.challangeone;

public class Truck extends Vehicle{

    private double cargoCapacityTons;

    public Truck (String make, String model, int year, String registrationNumber, double cargoCapacityTons) {
        super(make, model, year, registrationNumber);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public double getMaintenanceCost() {
        return super.getMaintenanceCost() + ((cargoCapacityTons <= 10) ? 300.0 : (cargoCapacityTons <=15) ? 450 : 600) ;
    }

    @Override
    public String describe() {
        return "Truck: " + super.describe() + "\nCargo Capacity: " + cargoCapacityTons + " tons";
    }
}
