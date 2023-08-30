package com.assignment.employee;

import java.io.EOFException;

public class Employee {
    private String employeeName;
    private int employeeID;
    private double salary;
    private static int tempID=1;

    public Employee(String employeeName,double salary) {
        this.employeeName = employeeName;
        this.employeeID = tempID;
        this.salary = salary;
        tempID++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +", employee Salary="+salary+
                '}';
    }
}
