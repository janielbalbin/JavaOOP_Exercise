package employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        emp.calculateBonus(10);
        emp.displayInfo();

        System.out.println();

        Manager mgr = new Manager("Bob", "Project Manager", 70000, 5000);
        mgr.addAllowance();
        mgr.displayInfo();
    }
}
