package lesson27.genericschallange;

public abstract class GameItem implements LootItem {

    private String name;
    private String rarity;
    private int value;

    public GameItem(String name, String rarity, int value) {
        this.name = name;
        this.rarity = rarity;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRarity() {
        return rarity;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\n(name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                ", value=" + value +
                ',';
    }

    @Override
    public boolean matches(String field, String value) {
        String fName = field.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "RARITY" -> rarity.equalsIgnoreCase(value);
            case "VALUE" -> this.value == Integer.parseInt(value);
            default -> false;
        };
    }
}
