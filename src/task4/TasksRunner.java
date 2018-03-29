package task4;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by sergey.kliepikov on 3/28/18.
 */
public class TasksRunner {

    public static void main(String[] args) {
        Task task1 = new Task(1, "ZR", "ABC", LocalDateTime.of(2000, Month.DECEMBER, 12, 13, 45), Priority.MAJOR);
        Task task2 = new Task(2, "F", "DEF", LocalDateTime.of(2000, Month.NOVEMBER, 10, 13, 45), Priority.MINOR);
        Task task3 = new Task(3, "B", "GHI", LocalDateTime.of(2000, Month.SEPTEMBER, 12, 13, 45), Priority.NORMAL);

        Tasks tasks = new Tasks();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        tasks.sort(TaskComparators.byName());
        System.out.println("Sorted by Name: " + tasks);

        tasks.sort(TaskComparators.byPriority());
        System.out.println("Sorted by Priority: " + tasks);

        tasks.sort(TaskComparators.byDeadline());
        System.out.println("Sorted by Deadline: " + tasks);

        System.out.println("Name Containing Z: " + tasks.filter(TaskPredicates.nameContains("Z")));

        System.out.println("MAJOR tasks:" + tasks.filter(TaskPredicates.hasPriority(Priority.MAJOR)));

        System.out.println("Expired date:" + tasks.filter(TaskPredicates.hasExpiredDeadline(LocalDateTime.now())));
    }


}
