package jkonst.debiotech.main;

public class Task {

    private char name;

    public Task(char name) {
        this.name = name;
    }

    public void run(StringBuilder tasksThisSecond) {
        tasksThisSecond.append(name);
    }
}

