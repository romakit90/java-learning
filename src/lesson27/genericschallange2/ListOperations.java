package lesson27.genericschallange2;

import java.util.ArrayList;
import java.util.List;

public class ListOperations<T extends DroneDeliveryHub>{

    List<T> itemList = new ArrayList<>();

    public ListOperations() {}

    public ListOperations(List<T> itemList) {
        this.itemList = itemList;
    }

    public void printList(List<?> list) {

        for (var item : list) {
            System.out.println(item);
        }
    }

    public static <U extends DroneDeliveryHub> List<U> findMatches(List<U> list, String field, String value) {

        List<U> matches = new ArrayList<>();
        for (var item : list) {
            if (item.matches(field, value)) {
                matches.add(item);
            }
        }
        return matches;

    }
    public List<T> findMatches(String field, String value) {

        List<T> matches = new ArrayList<>();
        for (var item : itemList) {
            if (item.matches(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
