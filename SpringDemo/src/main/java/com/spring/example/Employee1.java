package com.spring.example;

public class Employee1 {
    private int id;
    private String name;
    private double salary;

    // Default Constructor
    public Employee1() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to Display Employee Details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main Method to Test the Class
    public static void main(String[] args) {
        Employee1 emp = new Employee1(101, "John Doe", 50000);
        emp.displayEmployeeInfo();
    }
}
