package task4;

import java.time.LocalDateTime;
import java.util.function.Predicate;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().contains(substring);
            }
        };
    }

    public static Predicate<Task> hasExpiredDeadline(LocalDateTime date) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getDeadline().compareTo(date) > 0;
            }
        };
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getPriority().equals(priority);
            }
        };
    }
}
