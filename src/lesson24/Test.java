package lesson24;

public class Test {

    public static void main(String[] args) {

        Jet jet2 = new Jet();
        inFlight(jet2);
        Satellite satellite1 = new Satellite();

//        OrbitEarth.log("Testing " + satellite1);
        orbit(satellite1);


    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
