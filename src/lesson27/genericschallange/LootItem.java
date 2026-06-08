package lesson27.genericschallange;

import java.util.ArrayList;
import java.util.List;

public interface LootItem {

    String getName();
    String getRarity();
    boolean matches(String field, String value);

}

class Vault<T extends LootItem> {

    private List<T> items;

    public Vault(List<T> items) {
        this.items = items;
    }

    public List<T> findMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matches(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public static <U extends LootItem> List<U> findMatches(List<U> items, String field, String value) {

        List<U> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matches(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
