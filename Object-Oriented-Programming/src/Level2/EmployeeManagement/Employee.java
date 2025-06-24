package Level2.EmployeeManagement;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: Rs" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public double getSalary() {
        return salary;
    }
}

