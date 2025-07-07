package LinkedList.TaskScheduler;

public class Task {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
