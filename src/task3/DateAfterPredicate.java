package task3;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class DateAfterPredicate implements Predicate<LocalDate> {

    private final LocalDate minDate;

    public DateAfterPredicate(LocalDate minDate) {
        this.minDate = minDate;
    }

    @Override
    public boolean test(LocalDate date) {
        return date.compareTo(minDate) > 0;
    }
}

