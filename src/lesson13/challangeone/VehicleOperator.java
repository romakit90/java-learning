package lesson13.challangeone;

public class VehicleOperator extends Employee {

    private String vehicleType;

    public VehicleOperator(String name, int age, String contactPhone,
                           String email, String employmentDate, String position, String vehicleType) {
        super(name, age, contactPhone, email, employmentDate, position);
        this.vehicleType = vehicleType;
    }

    @Override
    public double calculateSalary() {
        String normalizedVehicleType = (vehicleType == null) ? "" : vehicleType.toLowerCase();
        return switch (normalizedVehicleType) {
            case "van" -> super.calculateSalary() + 1000.0;
            case "truck" -> super.calculateSalary() + 3000.0;
            default -> super.calculateSalary();
        };
    }

    @Override
    public String toString() {
        return "VehicleOperator{" +
                "vehicleType='" + vehicleType + '\'' +
                "} \n" + super.toString() + "\n";
    }
}
