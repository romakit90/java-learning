package lesson14.compositionchallange;

public class CoffeeMaker {

    public boolean hasWorkToDo () {

        return false;
    }

    public void brewCoffee () {
        if(hasWorkToDo()) {
            System.out.println("Brewing coffee");
        }

    }

}
