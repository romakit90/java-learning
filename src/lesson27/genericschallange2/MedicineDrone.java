package lesson27.genericschallange2;

enum MedicineType{POM, P, GSL}

public class MedicineDrone extends DroneBlueprint{

    private String medicineType;
    private String priority;

    public MedicineDrone() {
        super("Medicine Delivery Drone");

        MedicineType randomType = MedicineType.values()[random.nextInt(MedicineType.values().length)];
        this.medicineType = switch (randomType) {
            case POM -> "Prescription‑Only";
            case P -> "Pharmacy";
            case GSL -> "General Sales List";
        };
        this.priority = switch (randomType) {
            case POM -> "Urgent Delivery";
            case P -> "Priority Delivery";
            case GSL -> "Regular Delivery";
        };

    }

    @Override
    public String toString() {
        return "%s %-20s %-20s".formatted(super.toString(), medicineType, priority);
    }

    @Override
    public boolean matches(String field, String value) {
        String f = field.toUpperCase();
        return switch (f) {
            case "MEDICINETYPE" -> medicineType.equalsIgnoreCase(value);
            case "PRIORITY" -> priority.equalsIgnoreCase(value);
            default -> super.matches(field, value);
        };

    }
}
