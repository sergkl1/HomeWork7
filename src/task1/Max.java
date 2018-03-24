package task1;

import java.util.Comparator;
import java.util.List;

/**
 * Created by sergey.kliepikov on 3/24/18.
 */
public class Max {
    public static <T> T max (List<T> list, Comparator<T> comparator) {
        T max = list.get(0);

        for (T item : list) {
            if (comparator.compare(item, max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
