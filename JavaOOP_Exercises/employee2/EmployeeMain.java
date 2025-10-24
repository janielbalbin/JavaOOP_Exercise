package employee2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Manager", 50000);
        System.out.println(emp.name + " earns $" + emp.salary);
        emp.updateSalary(55000);
        System.out.println("Updated salary: $" + emp.salary);
    }
}
