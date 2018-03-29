package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class Tasks {

    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

        public List<Task> filter(Predicate<Task> predicate) {
            List<Task> result = new ArrayList<>();

            for (Task task : tasks) {
                if (predicate.test(task)) {
                    result.add(task);
                }
            }
            return result;
        }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}





