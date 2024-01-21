public class Manager extends Employee {
    // Manager unique fields.
    protected String department;

    // Constructor
    public Manager () {
        super(); // Calls constructor of employee.
        department = ""; // Sets department to a default value.
    }

    // Setters and Getters
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    // Overridden employeeSummary method.
    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Employee Department: " + getDepartment());
    }
}
