package lesson14.compositionchallange;

public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();


//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().doDishes();

        smartKitchen.setKitchenState(false, true, false);
        smartKitchen.doKitchenWork();


    }
}


