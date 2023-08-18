A device must schedule 5 tasks with the following <u>Requirements:</u>
- Task A must run every second
- Task B must run every 5 seconds
- Task C must run every 5 seconds
- Task D must run every 10 seconds
- Task E must run every 10 seconds
- There must be no more than 2 tasks running at the same time
- It is OK if tasks B and C run for the first time before the first 5s elapsed
- It is OK if tasks D and E run for the first time before the first 10s elapsed

## How to run the program
0. Checkout the code from this repo. 
1. Ensure that Java is installed on your computer. (Current version of the program is using Java 17).
2. Create a directory for compiled classes. ```mkdir out```
3. Compile all Java classes ```javac -d out src/jkonst/debiotech/main/*.java```
4. Package into an executable JAR: ```jar cvfm MyTasksScheduler.jar src/META-INF/MANIFEST.MF -C out/ .```
5. Run the JAR ```java -jar MyTasksScheduler.jar```
   - You can pass as an argument the total time of execution in seconds (only positive integer values allowed) e.g. ```java -jar MyTasksScheduler.jar 10```