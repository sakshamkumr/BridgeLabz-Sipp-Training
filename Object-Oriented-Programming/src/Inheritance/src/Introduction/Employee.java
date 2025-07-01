package Introduction;

public class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee() {

    }
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 101, 90000, 5);
        Employee e2 = new Developer("Neha", 102, 75000, "Java");
        Employee e3 = new Intern("Rahul", 103, 15000, "Amit");

        e1.displayDetails();
        System.out.println("--------");
        e2.displayDetails();
        System.out.println("--------");
        e3.displayDetails();
    }
}
class Manager extends Employee {
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);

    }
}
class Developer extends Employee {
    private final String programmingLanguage;
    String ProgrammingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    private String mentorName;

    public Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Mentor: " + mentorName);
    }
}
