package lesson13.challangeone;

public class Car extends Vehicle {
    private int numDoors;
    private String type;

    public Car(String make, String model, int year, int numDoors, String type) {
        super(make, model, year);
        this.numDoors = numDoors;
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
}
