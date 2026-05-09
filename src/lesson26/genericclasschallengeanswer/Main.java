package lesson26.genericclasschallengeanswer;

public class Main {

    public static void main(String[] args) {

        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44, -110"),
                new Park("Grand Canyon", "36, -112"),
                new Park("Yosemite", "37, -119")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[] {
                new River("Mississippi", "47, -95", "29, -89"),
                new River("Missouri", "47, -111", "38, -90")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(new River("Colorado", "40, -105", "31, -114"));

        riverLayer.renderLayer();
    }
}
