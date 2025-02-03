package com.wipro.java.oops.encapsulation;

public class Animal {
	
	
	private String Name;
	private String Type;
	private int Weight;
	
	
	public Animal(String name, String type, int weight) {
		super();
		this.Name = name;
		this.Type = type;
		this.Weight = weight;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		this.Type = type;
	}


	public int getWeight() {
		return Weight;
	}


	public void setWeight(int weight) {
		if(weight>0) {
			this.Weight=weight;
		}
		else {
			System.out.println("weight must be positive");
		}
		this.Weight = weight;
	}
	public static void main(String a[]){
		Animal a1 = new Animal("lion","carnivor",100);
		System.out.println(a1.getName());
		System.out.println(a1.Type);
		System.out.println(a1.getWeight());
		
		
		
		a1.setWeight(50);
		System.out.println(a1.getWeight());
				
	}


	

}
