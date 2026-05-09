package lesson25.interfacechallange;

import java.util.List;

public interface Mappable {

    String JSON_PROPERTY ="\"properties\": {%s}";

    String label();

    String geometryType();

    String icon();

    String getName();

    String getUsage();

    default String toJSON() {
        return String.format("\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\"", geometryType(), label(), icon());

    }

    static void printProperties(List<Mappable> mappable) {

        for (var prop : mappable){
            String fullJson = prop.toJSON() + String.format(", \"name\": \"%s\", \"usage\": \"%s\"", prop.getName(), prop.getUsage());
            System.out.printf(Mappable.JSON_PROPERTY, fullJson);
            System.out.println(" ");
            System.out.println("-".repeat(30));
        }
    }

}
