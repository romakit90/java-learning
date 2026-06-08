package lesson27.genericschallange2;

enum ClothingType{APPAREL, FOOTWEAR, ACCESSORIES}
enum Condition{NEW, USED}

public class ClothingDrone extends DroneBlueprint{

    private String type;
    private String condition;

    public ClothingDrone() {
        super("Clothing Delivery Drone");

        ClothingType randomType = ClothingType.values()[random.nextInt(ClothingType.values().length)];
        this.type = switch (randomType) {
            case APPAREL -> "Apparel";
            case FOOTWEAR -> "Footwear";
            case ACCESSORIES -> "Accessories";
        };
        Condition randomType2 = Condition.values()[random.nextInt(Condition.values().length)];
        this.condition = switch (randomType2) {
            case NEW -> "New";
            case USED -> "Used";
        };
    }

    @Override
    public String toString() {
        return "%s %-20s %-12s".formatted(super.toString(), type, condition);
    }

    @Override
    public boolean matches(String field, String value) {
        String f = field.toUpperCase();
        return switch (f) {
            case "TYPE" -> type.equalsIgnoreCase(value);
            case "CONDITION" -> condition.equalsIgnoreCase(value);
            default -> super.matches(field, value);
        };

    }
}
