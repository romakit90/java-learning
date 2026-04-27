package lesson17.oopmasterchallenge;

public class Drink{

    private String type; // "coca-cola" "fanta" "sprite" "water"
    private String size;
    private double price;

    public Drink() {
        System.out.println("No args drink");

    }

    public Drink(String type, String size, double price) {
        String typeToLowerCase = type.toLowerCase();
        this.type = switch (typeToLowerCase) {
            case "fanta" -> "Fanta";
            case "coca-cola" -> "Coca-Cola";
            case "sprite" -> "Sprite";
            case "water" -> "Water";
            default -> "Invalid type";
        };
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type + " (" + size + ")";
    }

    public void drinkPrice() {
        System.out.println("$" + price + " " + type + "(" + size + ")");
    }

    public double getPrice() {

        return price;
    }
}
