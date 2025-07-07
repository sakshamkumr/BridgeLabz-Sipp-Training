package LinkedList.TaskScheduler;

public class Scheduler {
    private Task head = null;
    private Task currentTask = null;

    // Add task at beginning
    void addAtBeginning(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Task tail = head;
            while (tail.next != head) tail = tail.next;
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Add task at end
    void addAtEnd(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Task tail = head;
            while (tail.next != head) tail = tail.next;
            tail.next = newNode;
            newNode.next = head;
        }
    }

    // Add at specific position
    void addAtPosition(int id, String name, int priority, String date, int position) {
        if (position <= 0) {
            addAtBeginning(id, name, priority, date);
            return;
        }
        Task  newNode = new Task(id, name, priority, date);
        Task temp = head;
        for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    void removeByTaskID(int taskID) {
        if (head == null) return;

        Task temp = head, prev = null;
        do {
            if (temp.taskID == taskID) {
                if (temp == head) {
                    Task tail = head;
                    while (tail.next != head) tail = tail.next;
                    if (head == head.next) {
                        head = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // View current task
    void viewCurrentTask() {
        if (currentTask == null) currentTask = head;
        if (currentTask != null)
            System.out.println("Current Task → ID: " + currentTask.taskID + ", Name: " + currentTask.taskName + ", Priority: " + currentTask.priority + ", Due: " + currentTask.dueDate);
    }

    // Move to next task
    void moveToNextTask() {
        if (currentTask != null)
            currentTask = currentTask.next;
    }

    // Display all tasks
    void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskID + " | Name: " + temp.taskName + " | Priority: " + temp.priority + " | Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    void searchByPriority(int searchPriority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == searchPriority)
                System.out.println("Found → " + temp.taskName + " (ID: " + temp.taskID + ", Due: " + temp.dueDate + ")");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.addAtEnd(101, "Prepare Presentation", 2, "2025-07-10");
        scheduler.addAtBeginning(102, "Team Meeting", 3, "2025-07-08");
        scheduler.addAtPosition(103, "Code Review", 1, "2025-07-09", 1);

        scheduler.displayAllTasks();
        System.out.println("---- Search Priority 2 ----");
        scheduler.searchByPriority(2);

        System.out.println("---- Viewing Tasks ----");
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();

        scheduler.removeByTaskID(102);
        System.out.println("---- After Removal ----");
        scheduler.displayAllTasks();
    }
}
