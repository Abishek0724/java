package com.wipro.java.oops.inheritance;

/**
 * parent class employee
 * child class developer
 * extends is keyword
 */
 
public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]){
		Employee employee = new Developer();
		employee.setEmpid(1236);
		employee.setName("abii");
		employee.setEmail("abii");
		employee.setSalary((float) 10000.10);
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSalary());
	}
}
