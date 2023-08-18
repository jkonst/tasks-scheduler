package jkonst.debiotech.main;

public class Main {

    public static void main(String[] args) {
        int totalTime = fetchTotalTimeFromArgs(args);
        TaskScheduler scheduler = new TaskScheduler(totalTime);
        scheduler.schedule();
    }

    private static int fetchTotalTimeFromArgs(String[] args) {
        int defaultTime = 20;  // default value

        if (args.length > 0) {
            try {
                return Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("The provided argument is not a valid number. Using default TOTAL_TIME of " + defaultTime + ".");
                return defaultTime;
            }
        } else {
            return defaultTime;
        }
    }
}
