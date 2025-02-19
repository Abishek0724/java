package com.wipro.java.collection.usecase;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + id + ", Name='" + name + '\'' + ", Salary=" + salary + '}';
    }
}

// Comparator to sort employees by name
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class LinkedListSorting {  // Removed 'public'
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(101, "Alice", 50000));
        employeeList.add(new Employee(103, "Charlie", 70000));
        employeeList.add(new Employee(102, "Bob", 60000));

        System.out.println("Before Sorting:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        Collections.sort(employeeList, new NameComparator());

        System.out.println("\nAfter Sorting by Name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

