package com.wipro.java.collection;

import java.util.HashMap;

public class HashMapImplementation2 {
  public static void main(String[] args) {

    // create a hashmap
	//hashMap creation with 8 capacity and 0.6 load factor
    HashMap<String, Integer> languages = new HashMap<>();
    
    // add elements to hashmap
    languages.put("Java", 11);
    languages.put("c", 12);
    languages.put("c++", 7);
    System.out.println("HashMap: " + languages);
  }
}