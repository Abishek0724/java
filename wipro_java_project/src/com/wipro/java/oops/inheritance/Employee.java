/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * @author ABI
 *
 */
public class Employee {

	private int Empid;
	private String Name;
	private String Email;
	private float Salary;
	private boolean Istaxapplicable;
	/**
	 * @return the employeeid
	 */
	public int getEmpid() {
		return Empid;
	}

	/**
	 * @param employeeid the employeeid to set
	 */
	public void setEmpid(int Empid) {
		this.Empid = Empid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String Email) {
		this.Email = Email;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float Salary) {
		this.Salary = Salary;
	}

	/**
	 * @return the istaxapplicable
	 */
	public boolean isIstaxapplicable() {
		return Istaxapplicable;
	}

	/**
	 * @param istaxapplicable the istaxapplicable to set
	 */
	public void setIstaxapplicable(boolean Istaxapplicable) {
		Istaxapplicable = Istaxapplicable;
	}

}
