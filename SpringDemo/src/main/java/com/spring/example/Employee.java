package com.spring.example;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Default Constructor
    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods
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

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // Default constructor
        emp1.displayEmployeeDetails();

        Employee emp2 = new Employee(101, "John Doe", 55000.0); // Parameterized constructor
        emp2.displayEmployeeDetails();
    }
}
