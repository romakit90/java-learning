package lesson23.abstractclasschallange;

public class Milk extends ProductForSale{

//    public Milk(String type, String description, double price) {
//        super(type, description, price);
//    }

    public Milk() {
        type = "Milk";
        description = "small";
        price = 1.5;
    }

    @Override
    public void showDetails() {

        System.out.println("(" + description + " " + type + " $" + price + ")");
    }

    @Override
    public String toString() {
        return "(" + description + " " + type + " $" + price + ")";
    }
}
