package jkonst.debiotech.main;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
    private int totalTime;

    public TaskScheduler(int totalTime) {
        this.totalTime = totalTime;
    }

    public void schedule() {
        List<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= totalTime; i++) {
            if (!tasks.isEmpty()) {
                tasks.clear();
            }
            tasks.add(new Task('A'));

            if (i == 2 || (i - 2) % 5 == 0) {
                tasks.add(new Task('B'));
            } else if (i == 3 || (i - 3) % 5 == 0) {
                tasks.add(new Task('C'));
            } else if (i == 4 || (i - 4) % 10 == 0) {
                tasks.add(new Task('D'));
            } else if (i == 5 || (i - 5) % 10 == 0) {
                tasks.add(new Task('E'));
            }

            StringBuilder tasksThisSecond = new StringBuilder().append(i).append(" -> ");
            for (int j = 0; j < tasks.size(); j++) {
                tasks.get(j).run(tasksThisSecond);
                if (j != tasks.size() - 1) {
                    tasksThisSecond.append(" ");
                }
            }

            System.out.println(tasksThisSecond);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
