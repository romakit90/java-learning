package lesson08.constructorchallange;

public class Customer {

    String name;
    double creditLimit;
    String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("John Smith", 10000.0, "JS777@dot.com");
    }

    public Customer(String name, String email) {
        this(name, 90000.0, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
