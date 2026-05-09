package lesson26.genericclasschallenge;

public class Point implements Mappable{
    @Override
    public void render() {

    }
}

class Parks extends Point {

    private String name;
    private String type;
    private double latitude;
    private double longitude;

    public Parks(String name, String type, double latitude, double longitude) {
        this.name = name;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void render() {
        System.out.printf("Render " + name + " as " + type + " ([" + latitude + ", "
        + longitude + "])");
    }
}