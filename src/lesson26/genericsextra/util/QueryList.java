package lesson26.genericsextra.util;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends ArrayList<T> & QueryItem> {

    public QueryList() {
    }



    public static <U extends QueryItem> List<U> getMatches(List<U> items, String field, String value) {

        List<U> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }



}
