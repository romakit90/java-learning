package lesson25.interfacechallange;

public class Building implements Mappable {

    String name;
    String usage;
    String type;
    String icon;

    public Building(String name, String usage, String type, String icon) {
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

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON();
    }
}
