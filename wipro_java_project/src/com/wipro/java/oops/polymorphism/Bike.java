/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * @author ABI
 *polymorphism is done here!
 */
public class Bike {
	private String modal;
	private int year;
	private String color;
	/**
	 * @return the modal
	 */
	public String getModal() {
		return modal;
	}
	/**
	 * @param modal the modal to set
	 */
	public void setModal(String modal) {
		this.modal = modal;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
			}
	
	public void Bikedetails() {
		System.out.println("It's royalenfield"+getModal()+getYear()+"colo"+getColor());
		
	}

}
