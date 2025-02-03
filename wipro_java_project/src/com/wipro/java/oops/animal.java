/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author ABI
 *no constructors
 *getters have  return value
 *setters have no return value
 *properties are determined using private fields
 *values are behaviors are determined through setters
 *to string will convert entire animal class with properties and behaviors
 */
public class animal {

	private String name;
	private String type;
	private float weight;
	/**
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 * @return the type
	 */
	private String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	private void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the weight
	 */
	private float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	private void setWeight(float weight) {
		this.weight = weight;
	}

}
