package LinkedList.SchedulingAlgorithm;

class RoundRobin {
    private Process head = null;

    // 1. Add a process at the end
    public void addProcess(Process p) {
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = p;
            p.next = head;
        }
    }

    // 2. Remove a process by ID
    private void removeProcess(int processID) {
        if (head == null) return;

        Process current = head, prev = null;
        do {
            if (current.processID == processID) {
                if (current == head && current.next == head) {
                    head = null;
                } else {
                    if (current == head) {
                        Process tail = head;
                        while (tail.next != head) tail = tail.next;
                        head = head.next;
                        tail.next = head;
                    } else {
                        prev.next = current.next;
                    }
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // 3. Simulate Round Robin Scheduling
    public void simulate(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = countProcesses();

        Process current = head;
        System.out.println("Starting Round Robin Scheduling with Time Quantum: " + timeQuantum);

        while (processCount > 0) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                time += execTime;
                current.remainingTime -= execTime;

                System.out.println("Process " + current.processID + " executed for " + execTime + " units. Remaining: " + current.remainingTime);

                if (current.remainingTime == 0) {
                    int turnaround = time;
                    int waiting = turnaround - current.burstTime;
                    totalTurnAroundTime += turnaround;
                    totalWaitingTime += waiting;
                    System.out.println("Process " + current.processID + " completed. Turnaround: " + turnaround + ", Waiting: " + waiting);
                    removeProcess(current.processID);
                    processCount--;
                    current = head;
                    continue;
                }
            }
            current = current.next;
        }

        double avgWaiting = (double) totalWaitingTime / (processCount + totalWaitingTime / timeQuantum);
        double avgTurnAround = (double) totalTurnAroundTime / (processCount + totalTurnAroundTime / timeQuantum);

        System.out.printf("Average Waiting Time: %.2f\n", avgWaiting);
        System.out.printf("Average Turnaround Time: %.2f\n", avgTurnAround);
    }

    // 4. Display Circular Queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("Process queue is empty.");
            return;
        }

        System.out.println("Current Process Queue:");
        Process current = head;
        do {
            System.out.println("ID: " + current.processID + ", Burst: " + current.burstTime + ", Remaining: " + current.remainingTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();

        scheduler.addProcess(new Process(1, 10, 2));
        scheduler.addProcess(new Process(2, 5, 1));
        scheduler.addProcess(new Process(3, 8, 3));

        scheduler.displayQueue();
        scheduler.simulate(4); // Fixed time quantum
    }
}
