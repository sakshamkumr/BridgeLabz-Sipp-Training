package ClassesAndObjects.Level1;

public class Employee {
    String name;
    String id;
    double salary;
    public Employee() {
        name = null;
        id = null;
        salary = 0;
    }
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
