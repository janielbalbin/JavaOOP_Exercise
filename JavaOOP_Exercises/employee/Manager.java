package employee;

public class Manager extends Employee {
    private double allowance;

    public Manager(String name, String jobTitle, double salary, double allowance) {
        super(name, jobTitle, salary);
        this.allowance = allowance;
    }

    public void addAllowance() {
        updateSalary(getSalary() + allowance);
    }
}
