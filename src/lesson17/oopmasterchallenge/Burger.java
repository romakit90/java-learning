package lesson17.oopmasterchallenge;

public class Burger{

    private String type; // "cheeseburger" "hamburger" "chickenBurger" "fishBurger"
    private double price;

    public Burger() {
        System.out.println("No args burger");

    }

    public Burger(String type, double price) {
        String typeToLowerCase = type.toLowerCase();
        this.type = switch (typeToLowerCase) {
            case "cheeseburger" -> "Cheeseburger";
            case "hamburger" -> "Hamburger";
            case "chickenburger" -> "ChickenBurger";
            case "fishburger" -> "FishBurger";
            default -> "Invalid type";
        };
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void burgerPrice() {
        System.out.println("$" + price + " " + type);
    }

    public double getPrice() {

        return price;
    }
}
