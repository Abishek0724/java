package com.wipro.java.oops.inheritance;

public class ProjectLead extends Employee{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee employee = new ProjectLead();
		employee.setEmpid(1234);
		employee.setName("abii");
		employee.setEmail("abii");
		employee.setSalary((float) 10000.10);
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSalary());

		
		
	}

}
