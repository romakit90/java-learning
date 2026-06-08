package lesson27.genericschallange2;

enum FoodType{FROZEN, FRESH, PREPARED, LIQUID}

public class FoodDrone extends DroneBlueprint implements DroneDeliveryHub{

    private String foodType;
    private String containerType;

    public FoodDrone() {
        super("Food Delivery Drone");

        FoodType randomType = FoodType.values()[random.nextInt(FoodType.values().length)];
        this.foodType = switch (randomType) {
            case FROZEN -> "Frozen Food";
            case FRESH -> "Fresh Food";
            case PREPARED -> "Prepared Food";
            case LIQUID -> "Drinks";
        };
        this.containerType = switch (randomType) {
            case FROZEN, FRESH -> "Refrigerated Container";
            case PREPARED, LIQUID -> "Regular Box";
        };
    }

    @Override
    public String toString() {
        return "%s %-20s %-20s".formatted(super.toString(), foodType, containerType);
    }

    @Override
    public boolean matches(String field, String value) {
        String f = field.toUpperCase();
        return switch (f) {
            case "FOODTYPE" -> foodType.equalsIgnoreCase(value);
            case "CONTAINERTYPE" -> containerType.equalsIgnoreCase(value);
            default -> super.matches(field, value);
        };

    }
}
