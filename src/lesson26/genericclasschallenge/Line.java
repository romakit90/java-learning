package lesson26.genericclasschallenge;

public class Line implements Mappable{
    @Override
    public void render() {

    }
}

class Rivers extends Line {

    private String name;
    private String type;
    private double latitude;
    private double longitude;
    private double latitude2;
    private double longitude2;
    private double latitude3;
    private double longitude3;

    public Rivers(String name, String type, double latitude, double longitude, double latitude2, double longitude2, double latitude3, double longitude3) {
        this.name = name;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.latitude2 = latitude2;
        this.longitude2 = longitude2;
        this.latitude3 = latitude3;
        this.longitude3 = longitude3;
    }

    @Override
    public void render() {
        System.out.printf("Render " + name + " as " + type + " ([" + latitude + ", "
                + longitude + "], [" + latitude2 + ", " + longitude2 + "], ["
        + latitude3 + ", " + longitude3 + "]])");
    }
}
