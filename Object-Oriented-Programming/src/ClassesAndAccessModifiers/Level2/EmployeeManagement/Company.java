package Level2.EmployeeManagement;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager(501, "Engineering", 75000, "Backend Team");

        manager.displayManagerInfo();
        manager.updateSalary(82000);
        System.out.println("Current Salary: Rs" + manager.getSalary());
    }
}
