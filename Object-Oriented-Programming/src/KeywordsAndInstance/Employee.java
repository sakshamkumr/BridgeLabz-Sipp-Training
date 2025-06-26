package KeywordsAndInstance;

public class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Employee object.");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saksham Agrawal", 1001, "Backend Developer");
        Employee emp2 = new Employee("Jaguar", 1002, "UI/UX Designer");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        System.out.println();
        displayTotalEmployees();
    }
}
