package lesson26.genericclasschallenge;

public class Main {

    public static void main(String[] args) {

        Layer<Parks> parks = new Layer<>();
        parks.addElements(new Parks("Yellowstone", "National Park", 44.4882, -110.5916));
        parks.addElements(new Parks("Grand Canyon", "National Park", 36.0636, -112.1079));
        parks.addElements(new Parks("Yosemite", "National Park", 37.8855, -119.5360));
        parks.renderLayer(parks.getListOfElements());

        System.out.println("-".repeat(30));

        Layer<Rivers> rivers = new Layer<>();
        rivers.addElements(new Rivers("Mississippi", "River", 47.2160, -95.2348,
                35.1556, -90.0659, 29.1566, -89.2495));
        rivers.addElements(new Rivers("Colorado", "River", 40.4708, -105.8286,
                36.1015, -112.0892, 34.2964, -114.1148));
        rivers.renderLayer(rivers.getListOfElements());


    }
}


