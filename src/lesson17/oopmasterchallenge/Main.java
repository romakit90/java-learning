package lesson17.oopmasterchallenge;

public class Main {

    public static void main(String[] args) {

    Burger hamBurger = new Burger("hamburger", 2.0);
    Burger cheeseBurger = new Burger("cheeseburger" , 2.50);

    Drink fantaM = new Drink("fanta", "M", 2.50);
    Drink spriteL = new Drink("sprite", "L", 3.00);

    SideItem fries = new SideItem("fries", 4.50);
    SideItem boiledPotatoes = new SideItem("boiledpotatoes", 1.50);

    Restaurant hamburgerMenu = new Restaurant(hamBurger, fantaM, fries);
    Restaurant cheeseBurgerMenu = new Restaurant(cheeseBurger, spriteL, boiledPotatoes);

    Restaurant cheeseBurgerMeal = new Restaurant();
    cheeseBurgerMeal.cheeseBurgerMeal();

    Restaurant oneTopping = new Restaurant(cheeseBurger, spriteL, fries, "extrameat");
    Restaurant twoToppings = new Restaurant(cheeseBurger, spriteL, fries, "extrameat", "extracheese");
    Restaurant threeToppings = new Restaurant(cheeseBurger, spriteL, fries, "extrameat", "extracheese", "extraonions");

    Restaurant deluxMenu = new Restaurant(spriteL, hamBurger, fries, "extrameat", "none", "none");
    Restaurant deluxMenu2 = new Restaurant(fantaM, cheeseBurger, boiledPotatoes, "extracheese", "extraonions", "none");






    }
}
