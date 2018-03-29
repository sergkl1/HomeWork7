package task4;

import java.util.Comparator;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class TaskComparators {

    public static Comparator<Task> byName() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Task> byDeadline() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        };
    }

    public static Comparator<Task> byPriority() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getPriority().compareTo(o2.getPriority());
            }
        };
    }




}
