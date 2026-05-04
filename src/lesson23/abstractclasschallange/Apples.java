package lesson23.abstractclasschallange;

public class Apples extends ProductForSale{

//    public Apples(String type, String description, double price) {
//        super(type, description, price);
//    }

    public Apples() {
        type = "Apples";
        description = "large";
        price = 3.0;
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
