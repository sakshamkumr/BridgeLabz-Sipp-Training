package LinkedList.SchedulingAlgorithm;

class Process {
    int processID;
    int burstTime;
    int priority;
    int remainingTime;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
