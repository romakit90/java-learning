package lesson13.challangeone;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String model, int year, String registrationNumber, String type) {
        super(make, model, year, registrationNumber);
        this.type = type;
    }

    @Override
    public double getMaintenanceCost() {
        String normalizedType = (type == null) ? "" : type.toLowerCase();
        return switch (normalizedType) {
            case "coupe" -> super.getMaintenanceCost() - 50.0;
            case "van" -> super.getMaintenanceCost() + 150.0;
            default -> super.getMaintenanceCost();
        };
    }

    @Override
    public String describe() {
        return "Car:  " + super.describe() + "\nType: " + type;
    }
}
