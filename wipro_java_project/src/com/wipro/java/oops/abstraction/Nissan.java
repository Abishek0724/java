package com.wipro.java.oops.abstraction;

public class Nissan extends Car {
	/**
	@override*/
	void speed() {
		System.out.println("Avg speed is 120kmph");
	}
	/**
	@override*/
	void mileage() {
		System.out.println("avg milage is 10per litre");
	}

	public Nissan() {
		
	}

	public static void main(String[] args) {
		Car nissan = new Nissan();
		nissan.speed();
		nissan.mileage();

	}

}
