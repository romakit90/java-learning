package lesson24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animalBird = bird;
        FlightEnabled flierBird = bird;
        Trackable trackedBird = bird;
        Jet jet = new Jet();
        Truck truck = new Truck();
        Trackable trackedTruck = truck;

        animalBird.move();
//        flier.move();
//        tracked.move();

//        flierBird.takeOff();
//        flierBird.fly();
//        trackedBird.track();
//        flierBird.land();

//        bird.takeOff();
//        bird.fly();
//        bird.track();
//        bird.land();

        inFlight(flierBird);
        inFlight(bird);
        inFlight(jet);
        truck.track();
        trackedTruck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck treveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliersArray = new LinkedList<>();
        fliersArray.add(bird);

        List<FlightEnabled> fliersList = new ArrayList<>();
        fliersList.add(bird);

        triggerFliers(fliersArray);
        flyFliers(fliersArray);
        landFliers(fliersArray);

        triggerFliers(fliersList);
        flyFliers(fliersList);
        landFliers(fliersList);

    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }

}
