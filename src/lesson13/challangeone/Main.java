package lesson13.challangeone;

public class Main {

    public static void main(String[] args) {
        // Vehicle test:
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020, "");
        System.out.println(vehicle.describe());
        System.out.println("Maintenance Cost: $" + vehicle.getMaintenanceCost());
        System.out.println();



        Car car1 = new Car("Ford", "Mustang", 2021, "ABC-123", "coupe");
        System.out.println(car1.describe());
        System.out.println("Maintenance Cost: $" + car1.getMaintenanceCost());
        System.out.println();

        Car car2 = new Car("Tesla", "Model 3", 2022, "ABC-124", "sedan");
        System.out.println(car2.describe());
        System.out.println("Maintenance Cost: $" + car2.getMaintenanceCost());
        System.out.println();

        Car car3 = new Car("Honda", "Civic", 2019, "ABC-125", "van");
        System.out.println(car3.describe());
        System.out.println("Maintenance Cost: $" + car3.getMaintenanceCost());
        System.out.println();

        Truck truck1 = new Truck("Volvo", "FH16", 2020, "ABC-234", 8);
        System.out.println(truck1.describe());
        System.out.println("Maintenance Cost: $" + truck1.getMaintenanceCost());
        System.out.println();

        Truck truck2 = new Truck("Scania", "R500", 2021, "ABC-235", 12);
        System.out.println(truck2.describe());
        System.out.println("Maintenance Cost: $" + truck2.getMaintenanceCost());
        System.out.println();

        Truck truck3 = new Truck("Mercedes", "Actros", 2022, "ABC-236", 16);
        System.out.println(truck3.describe());
        System.out.println("Maintenance Cost: $" + truck3.getMaintenanceCost());
        System.out.println();

       Employee employee1 = new Employee("John Doe", 30, "555-1234", "DJ@dot.com",
               "01/01/2020", "developer");
       System.out.print(employee1);
       System.out.println();
       System.out.println("--------");

       VehicleOperator driver = new VehicleOperator("Jane Smith", 35, "555-5678", "drive@dot.com",
               "05/15/2019", "driver", "truck");
       System.out.print(driver);
       System.out.println(driverSalaryPlusMaintenance(driver, truck2));
       System.out.println("--------");

       VehicleOperator driver2 = new VehicleOperator("Jane Smith", 35, "555-5678", "drive@dot.com",
               "05/15/2019", "driver", "van");
       System.out.print(driver2);
       System.out.println("--------");

        VehicleOperator driver3 = new VehicleOperator("Jane Smith", 35, "555-5678", "drive@dot.com",
                "05/15/2019", "driver", "coupe");
        System.out.print(driver3);
        System.out.println("--------");

        // Test block
        System.out.println("\n===== CHALLENGE SELF-TEST =====");

// 1) Vehicle/Car/Truck maintenance checks
        double baseVehicleCost = vehicle.getMaintenanceCost();
        System.out.println("Base vehicle maintenance: " + baseVehicleCost);

        System.out.println("car1(coupe) expected base-50, actual: " + car1.getMaintenanceCost());
        System.out.println("car2(sedan/default) expected base, actual: " + car2.getMaintenanceCost());
        System.out.println("car3(van) expected base+150, actual: " + car3.getMaintenanceCost());

        System.out.println("truck1 maintenance: " + truck1.getMaintenanceCost());
        System.out.println("truck2 maintenance: " + truck2.getMaintenanceCost());
        System.out.println("truck3 maintenance: " + truck3.getMaintenanceCost());

// 2) Employee and VehicleOperator salary checks
        System.out.println("employee1 salary: " + employee1.calculateSalary());
        System.out.println("driver(truck) salary: " + driver.calculateSalary());
        System.out.println("driver2(van) salary: " + driver2.calculateSalary());
        System.out.println("driver3(coupe) salary: " + driver3.calculateSalary());

// 3) Integration totals (salary + maintenance)
        System.out.println(driverSalaryPlusMaintenance(driver, truck2));
        System.out.println(driverSalaryPlusMaintenance(driver2, car3));
        System.out.println(driverSalaryPlusMaintenance(driver3, car1));

// 4) Payment history test (catch date-format issues)
        try {
            System.out.println("\nPayment history for employee1:");
            System.out.println(employee1.paymentHistory().split("\n")[0]); // print first line only
            System.out.println("PASS: paymentHistory() runs.");
        } catch (Exception e) {
            System.out.println("FAIL: paymentHistory() crashed -> " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }




    }

    public static String driverSalaryPlusMaintenance(VehicleOperator driver, Vehicle vehicle) {
        double totalCost = driver.calculateSalary() + vehicle.getMaintenanceCost();
        return String.format("Total Salary for %s: $%.2f", driver.getName(), totalCost);



    }
}
