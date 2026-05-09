package lesson25.interfacechallange;

public class UtilityLine implements Mappable {

    String name;
    String usage;
    String type;
    String icon;

    public UtilityLine(String name, String usage, String type, String icon) {
        this.name = name;
        this.usage = usage;
        this.type = type;
        this.icon = icon;
    }

    @Override
    public String label() {
        return String.format("%s (%s)", name, usage);
    }

    @Override
    public String geometryType() {
        return type;
    }

    @Override
    public String icon() {
        return icon;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUsage() {
        return usage;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON();
    }
}
