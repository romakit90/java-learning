package lesson08.constructorchallange;

public class Main {
    public static void main(String[] args) {

    Customer first = new Customer("First One", 5000.0, "email@dot.com");
    System.out.println("Customer name: " + first.getName() + ", credit limit: " + first.getCreditLimit() + ", email: " + first.getEmail());

    Customer second = new Customer("Smith Second", "Smith@dot.com");
    System.out.println("Customer name: " + second.getName() + ", credit limit: " + second.getCreditLimit() + ", email: " + second.getEmail());

    Customer third = new Customer();
    System.out.println("Customer name: " + third.getName() + ", credit limit: " + third.getCreditLimit() + ", email: " + third.getEmail());
    }
}
