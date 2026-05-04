package lesson23.abstractclasschallange;

public class Oranges extends ProductForSale{

//    public Oranges(String type, String description, double price) {
//        super(type, description, price);
//    }

    public Oranges() {
        type = "Oranges";
        description = "mid";
        price = 2.0;
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
