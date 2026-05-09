package lesson26.genericclasschallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> listOfElements = new ArrayList<>();

    public void addElements(T t) {
        if (!listOfElements.contains(t)) {
            listOfElements.add(t);
        }
    }

    public List<T> getListOfElements() {
        return listOfElements;
    }

    public void renderLayer(List<T> list) {
        for (var t : list) {
            t.render();
            System.out.println();
        }
    }
}
