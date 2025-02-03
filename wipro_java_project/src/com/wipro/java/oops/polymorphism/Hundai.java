package com.wipro.java.oops.polymorphism;

public class Hundai extends Car{
	
	
		public void Cardetails() {
			System.out.println("It's hundai "+getModal()+" "+getYear()+" color: "+getColor());
		}
	
	public static void main(String a[]) {
		Car hundai = new Hundai();
		hundai.setModal("grandI10");
		hundai.setColor("red");
		hundai.setYear(2020);
		
		hundai.Cardetails();	
		
	}
	
	

	

}
