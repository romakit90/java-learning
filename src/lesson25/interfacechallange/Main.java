package lesson25.interfacechallange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Building building1 = new Building("Sydney Town Hall", "GOVERNMENT", "POINT", "RED STAR");
        Building building2 = new Building("Bank", "COMMERCIAL", "POINT", "DOLLAR SIGN");

        UtilityLine utilityLine1 = new UtilityLine("College St", "FIBER_OPTIC", "LINE", "GREEN DOTTED");

        List<Mappable> propertiesList = new ArrayList<>();
        propertiesList.add(building1);
        propertiesList.add(utilityLine1);
        propertiesList.add(building2);

        System.out.println(building2.toJSON());
        System.out.println("-".repeat(30));
        Mappable.printProperties(propertiesList);

    }
}
