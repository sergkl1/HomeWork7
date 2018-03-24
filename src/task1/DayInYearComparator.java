package task1;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Created by sergey.kliepikov on 3/24/18.
 */
public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate ld1, LocalDate ld2) {
        return ld1.getDayOfYear() - ld2.getDayOfYear();
        // OR: Integer.compare(ld1.getDayOfYear(), ld2.getDayOfYear());
    }
}
