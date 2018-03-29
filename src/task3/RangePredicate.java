package task3;

import java.util.function.Predicate;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class RangePredicate implements Predicate<Integer> {
    private final int min;
    private final int max;

    public RangePredicate(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Integer n) {
        return n >= min && n <= max;
    }
}

