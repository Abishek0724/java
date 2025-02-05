/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ExceptionEg {

	public static void main(String a[]) {
		int num1=20,num2=0,data;
		try {
			data = num1/num2;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("I am always Executed");
		}
		System.out.println("Rest of the code");
	}
	public ExceptionEg() {
		// TODO Auto-generated constructor stub
	}

}