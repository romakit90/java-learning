package lesson16.polymorphismchallange;

public class Main {

    public static void main(String[] args) {

//        GasPoweredCar gasCar = new GasPoweredCar(15, 4);
//        gasCar.startEngine();
//        gasCar.drive();
//
//        ElectricCar electricCar = new ElectricCar(300, 100);
//        electricCar.startEngine();
//        electricCar.drive();
//
//        HybridCar hybridCar = new HybridCar(20, 4, 200, 50);
//        hybridCar.startEngine();
//        hybridCar.drive();

        Car gasCar2 = new Car("Gas Powered Car");
        gasCar2.startEngine();
        gasCar2.drive();

        Car electricCar2 = new Car("Electric Car");
        electricCar2.startEngine();
        electricCar2.drive();

        Car hybridCar2 = new Car("Hybrid Car");
        hybridCar2.startEngine();
        hybridCar2.drive();

        Car gasCar = new GasPoweredCar(15, 4);
        gasCar.startEngine();
        gasCar.drive();


    }
}
