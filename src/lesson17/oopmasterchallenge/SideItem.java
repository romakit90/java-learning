package lesson17.oopmasterchallenge;

public class SideItem{

    private String type;
    private double price;

    public SideItem() {

    }

    public SideItem(String type, double price) {
        String typeToLowerCase = type.toLowerCase();
        this.type = switch (typeToLowerCase) {
            case "fries" -> "Fries";
            case "boiledpotatoes" -> "Boiled Potatoes";
            case "sweetpotatoes" -> "Sweet Potatoes";
            default -> "Invalid type";
        };
        this.price = price;
    }

    public void sideItemPrice() {
        System.out.println("$" + price + " " + type);
    }

    public double getPrice() {

        return price;
    }

    public String getType() {
        return type;
    }
}
