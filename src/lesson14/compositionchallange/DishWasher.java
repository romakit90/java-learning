package lesson14.compositionchallange;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes () {
        if(hasWorkToDo) {
            System.out.println("Doing the dishes");
            hasWorkToDo = false;
        }
    }
}
