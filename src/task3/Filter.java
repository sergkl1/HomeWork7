package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class Filter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for(T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
