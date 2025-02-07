package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public StreamApi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Abii", "Kavi");
		List<String> stream = list.stream().
				filter(name->name.startsWith("A")).
				collect(Collectors.toList());
		System.out.println(stream);
		List<String> stream1 = list.stream().
				map(String :: toUpperCase).
				collect(Collectors.toList());
		System.out.println(stream1); 
	}

}