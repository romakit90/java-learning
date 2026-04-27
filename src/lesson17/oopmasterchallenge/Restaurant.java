package lesson17.oopmasterchallenge;

public class Restaurant {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    private String extraTopping1;
    private String extraTopping2;
    private String extraTopping3;

    private double priceToPay = 0;

    public Restaurant() {

    }

    public Restaurant(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        getBurger().burgerPrice();
        getDrink().drinkPrice();
        getSideItem().sideItemPrice();
        double menuPrice1 = priceToPay;
        menuPrice1 += burger.getPrice();
        menuPrice1 += drink.getPrice();
        menuPrice1 += sideItem.getPrice();
        System.out.println("Your check is = $" + menuPrice1 + "\n");
    }

    public Restaurant(Burger burger, Drink drink, SideItem sideItem, String extraTopping1) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        String typeToLowerCase = extraTopping1.toLowerCase();
        this.extraTopping1 = switch (typeToLowerCase) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        getBurger().burgerPrice();
        getDrink().drinkPrice();
        getSideItem().sideItemPrice();
        System.out.println("$1.5 " + this.extraTopping1);
        double menuPrice2 = priceToPay;
        menuPrice2 += burger.getPrice();
        menuPrice2 += drink.getPrice();
        menuPrice2 += sideItem.getPrice();
        menuPrice2 += 1.50;
        System.out.println("Your check is = $" + menuPrice2 + "\n");
    }

    public Restaurant(Burger burger, Drink drink, SideItem sideItem, String extraTopping1, String extraTopping2) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        String typeToLowerCase = extraTopping1.toLowerCase();
        this.extraTopping1 = switch (typeToLowerCase) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        String typeToLowerCase2 = extraTopping2.toLowerCase();
        this.extraTopping2 = switch (typeToLowerCase2) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        getBurger().burgerPrice();
        getDrink().drinkPrice();
        getSideItem().sideItemPrice();
        System.out.printf("""
                $1.5 %s
                $1.5 %s 
                """, this.extraTopping1, this.extraTopping2);
        double menuPrice3 = priceToPay;
        menuPrice3 += burger.getPrice();
        menuPrice3 += drink.getPrice();
        menuPrice3 += sideItem.getPrice();
        menuPrice3 += 3.00;
        System.out.println("Your check is = $" + menuPrice3 + "\n");
    }

    public Restaurant(Burger burger, Drink drink, SideItem sideItem, String extraTopping1,
                      String extraTopping2, String extraTopping3) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        String typeToLowerCase = extraTopping1.toLowerCase();
        this.extraTopping1 = switch (typeToLowerCase) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        String typeToLowerCase2 = extraTopping2.toLowerCase();
        this.extraTopping2 = switch (typeToLowerCase2) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        String typeToLowerCase3 = extraTopping3.toLowerCase();
        this.extraTopping3 = switch (typeToLowerCase3) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "Invalid type";
        };
        getBurger().burgerPrice();
        getDrink().drinkPrice();
        getSideItem().sideItemPrice();
        System.out.printf("""
                $1.5 %s
                $1.5 %s
                $1.5 %s
                """, this.extraTopping1, this.extraTopping2, this.extraTopping3);
        double menuPrice4 = priceToPay;
        menuPrice4 += burger.getPrice();
        menuPrice4 += drink.getPrice();
        menuPrice4 += sideItem.getPrice();
        menuPrice4 += 4.50;
        System.out.println("Your check is = $" + menuPrice4 + "\n");
    }

    public Restaurant(Drink drink, Burger burger, SideItem sideItem, String extraTopping1,
                          String extraTopping2, String extraTopping3) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        String typeToLowerCase = extraTopping1.toLowerCase();
        this.extraTopping1 = switch (typeToLowerCase) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "";
        };
        String typeToLowerCase2 = extraTopping2.toLowerCase();
        this.extraTopping2 = switch (typeToLowerCase2) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "";
        };
        String typeToLowerCase3 = extraTopping3.toLowerCase();
        this.extraTopping3 = switch (typeToLowerCase3) {
            case "extracheese" -> "Extra Cheese";
            case "extraonions" -> "Extra Onions";
            case "extrameat" -> "Extra Meat";
            default -> "";
        };
        System.out.printf("""
                Your order:
                %s
                %s
                %s
                %s %s %s
                """, burger.getType(), drink.getType(), sideItem.getType(), this.extraTopping1, this.extraTopping2, this.extraTopping3);
        double menuPrice4 = 15.00;
        System.out.println("Your check is = $" + menuPrice4 + "\n");

    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }


    public void cheeseBurgerMeal() {
        System.out.println("""
                Your order is:
                    $2.5 Cheeseburger
                    $2.5 (M) Drink
                    $2.0 Fries
                Total Price:
                    $7.0
                    """);
    }


}
