package lesson13.challangeone;

public class Main {

    static void main(String[] args) {
        // Vehicle test:
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020);
        System.out.println(vehicle.describe());
        System.out.println("Maintenance Cost: $" + vehicle.getMaintenanceCost());


        // Car test:
        Car car = new Car("Honda", "Civic", 2019, 4, "van");
        System.out.println(car.describe());
        System.out.println("Maintenance Cost: $" + car.getMaintenanceCost());


    }
}
