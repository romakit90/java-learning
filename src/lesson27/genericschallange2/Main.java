package lesson27.genericschallange2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DroneBlueprint> allDrones = new ArrayList<>();


        for(int i = 0; i < 10; i++) {
            allDrones.add(new FoodDrone());
            allDrones.add(new MedicineDrone());
            allDrones.add(new ClothingDrone());
        }
        ListOperations<DroneDeliveryHub> operations = new ListOperations<>();


        // one sort operation by shared field
        //one sort operation by multiple keys (e.g., priority then cost/time)
        //run:

        //sort list A by key 1
        //sort list B by key 1 then key 2
        //swap first/last in one list
        //print after each operation

        //print all
        operations.printList(allDrones);
        System.out.println("-".repeat(30));

        //filter by shared field (Sector Two)
        List<DroneBlueprint> sectorTwoDrones = ListOperations.findMatches(allDrones, "ZONE", "Sector Two");
        operations.printList(sectorTwoDrones);
        System.out.println("-".repeat(30));

        //filter by type-specific field
        ListOperations<DroneBlueprint> foodOps = new ListOperations<>(allDrones);
        List<DroneBlueprint> fresh = foodOps.findMatches("FOODTYPE", "Fresh Food");
        operations.printList(fresh);
        System.out.println("-".repeat(30));

        //sort list A by Sector








    }


}
