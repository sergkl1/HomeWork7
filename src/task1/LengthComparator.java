package task1;

import java.util.Comparator;

/**
 * Created by sergey.kliepikov on 3/24/18.
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
        // OR: Integer.compare(s1.length(), s2.length());
    }
}

