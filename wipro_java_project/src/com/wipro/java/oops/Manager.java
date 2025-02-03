package com.wipro.java.oops;

public class Manager extends Employee{

	public Manager() {
	}
		public static void main(String a[]){
			Employee employee = new Manager();
			employee.setEmpid(1235);
			employee.setName("abii");
			employee.setEmail("abii");
			employee.setSalary((float) 10000.10);
			System.out.println(employee.getEmpid());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getSalary());
		}
	}


