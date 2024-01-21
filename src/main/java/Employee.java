public class Employee {

    // Employee fields.
    protected String firstName;
    protected String lastName;
    protected int employeeID;
    protected double salary;

    // Constructor
    public Employee() {
        salary = 0.00;
    }


    // Setters and Getters.
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    // Methods.
    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Employee Salary: " + salary);
    }

}
