/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author ABI
 *
 */
public class Employee {

	private int employeeid;
	private String name;
	private String email;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the employeeid
	 */
	private int getEmployeeid() {
		return employeeid;
	}

	/**
	 * @param employeeid the employeeid to set
	 */
	private void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	private String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	private void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the salary
	 */
	private float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	private void setSalary(float salary) {
		this.salary = salary;
	}

}
