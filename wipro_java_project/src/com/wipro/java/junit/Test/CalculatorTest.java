package com.wipro.java.junit.Test;

import org.junit.Test;

import com.wipro.java.junit.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

	public CalculatorTest() {
		// TODO Auto-generated constructor stub
	}
	
	private final Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		int result = calculator.add(3, 2);
		assertEquals(5, result);
	}
	@Test
	public void testSubtract() {
		int result = calculator.subtract(5,3);
		assertEquals(2,result);
	}
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.add(-3, -2);
		assertEquals(-5, result);
	}
	public void testSubtractWithNegativeNumbers() {
		int result = calculator.subtract(-3, -2);
		assertEquals(-1, result);
	}
	
	
	
	

}