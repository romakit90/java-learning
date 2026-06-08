package lesson27.genericschallange2;

import java.util.Random;

enum DroneType {FOOD, MEDICINE, CLOTHING}
enum Zone {ONE, TWO, THREE, FOUR}

public class DroneBlueprint implements DroneDeliveryHub{

    private static int NEXT_ID = 1000;
    private int id;
    private String type;
    private String zone;
    DroneType droneType;

    Random random = new Random();

    public DroneBlueprint() {
        this.id = NEXT_ID++;
        DroneType randomDrone = DroneType.values()[random.nextInt(DroneType.values().length)];
        type = switch (randomDrone) {
            case FOOD -> "Food Delivery Drone";
            case MEDICINE -> "Medicine Delivery Drone";
            case CLOTHING -> "Clothing Delivery Drone";
        };
        Zone randomZone = Zone.values()[random.nextInt(DroneType.values().length)];
        zone = switch (randomZone) {
            case ONE -> "Sector One";
            case TWO -> "Sector Two";
            case THREE -> "Sector Three";
            case FOUR -> "Sector Four";
        };
    }

    public DroneBlueprint(String type) {
        this.id = NEXT_ID++;
        this.type = type;
        Zone randomZone = Zone.values()[random.nextInt(DroneType.values().length)];
        zone = switch (randomZone) {
            case ONE -> "Sector One";
            case TWO -> "Sector Two";
            case THREE -> "Sector Three";
            case FOUR -> "Sector Four";
        };
    }

    @Override
    public String toString() {
        return "%-6s %-26s %-15s".formatted(id, type, zone);
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean matches(String field, String value) {
        String f = field.toUpperCase();
        return switch (f) {
            case "ID" -> id == Integer.parseInt(value);
            case "TYPE" -> type.equalsIgnoreCase(value);
            case "ZONE" -> zone.equalsIgnoreCase(value);
            default -> false;
        };
    }

}
