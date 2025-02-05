/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class HashMapImplementation {

	public static void main(String a[]) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Strawberry");
		
		System.out.println("Key 1: " + map.get(1));
		System.out.println("Key 2: " + map.get(2));
		
		if (map.containsKey(3)) {
			System.out.println("Key 3 Exists With Value: " + map.get(3));
		}
		
		System.out.println("\n Iterating Through Map: ");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		map.remove(2);
		
		System.out.println("\n Map After Removal of Key 2: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}