package com.wipro.java.oops.polymorphism;

public class Royalenfield extends Bike{
	
	
		public void Bikedetails() {
			System.out.println("It's Royalenfield "+getModal()+" "+getYear()+" color: "+getColor());
		}
	
	public static void main(String a[]) {
		Bike royalenfield = new Royalenfield();
		royalenfield.setModal("Continental GT");
		royalenfield.setColor("red");
		royalenfield.setYear(2020);
		
		royalenfield.Bikedetails();	
		
	}
	
	

	

}