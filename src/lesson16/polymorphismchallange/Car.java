package lesson16.polymorphismchallange;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        switch (description) {
            case "Gas Powered Car":
                System.out.println("Please Insert and Turn a Key");
                break;
            case "Electric Car":
                System.out.println("Please Press the Start Button");
                break;
            case "Hybrid Car":
                System.out.println("Please Insert and Turn a Key or Press the Start Button");
                break;
            default:
                System.out.println("Invalid Car Type");
                break;
        }

    }

    public void drive() {
        runEngine();

    }

    protected void runEngine() {
            switch (description) {
                case "Gas Powered Car":
                    System.out.println("The Gas Engine is Running\n");
                    break;
                case "Electric Car":
                    System.out.println("The Electric Motor is Running\n");
                    break;
                case "Hybrid Car":
                    System.out.println("The Hybrid Engine is Running\n");
                    break;
                default:
                    System.out.println("Invalid Car Type\n");
                    break;
            }
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        super("Gas Powered Car");
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        super("Electric Car");
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, double avgKmPerCharge, int batterySize, int cylinders) {
        super("Hybrid Car");
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


}
