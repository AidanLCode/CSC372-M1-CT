public class Main {
    public static void main(String[] args) {

        // Creating an Employee and Manager
        Employee employee = new Employee();
        employee.setFirstName("Jack");
        employee.setLastName("Man");
        employee.setEmployeeID(123456);
        employee.setSalary(100000.00);
        employee.employeeSummary();

        System.out.println(""); // Prints a space.

        Manager manager = new Manager();
        manager.setFirstName("Boss");
        manager.setLastName("Man");
        manager.setEmployeeID(576790865);
        manager.setSalary(200000.00);
        manager.setDepartment("Clothing"); // Sets the unique manager field.
        manager.employeeSummary();




    }
}
