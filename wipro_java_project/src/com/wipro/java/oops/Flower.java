/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author ABI
 *
 */
public class Flower {

	/**
	 * 
	 */
	
		// TODO Auto-generated constructor stub
		String nameV;
		String colorV;
				
		Flower(String name,String color){
			this.nameV=name;
			this.colorV=color;
		}
		void display() {
			System.out.println("Flower name:"+nameV+" Color:"+colorV);
		}
		
		
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower flowerobject1=new Flower("rose","red");
		Flower flowerobject2=new Flower("hibiscus","white");
		flowerobject1.display();
		flowerobject2.display();

	}

}
