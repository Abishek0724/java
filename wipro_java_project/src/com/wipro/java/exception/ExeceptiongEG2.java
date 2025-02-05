package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExeceptiongEG2 {

	public static void main(String a[]) {
		try {
			File file = new File("Wrong Path");
			FileReader reader = new FileReader(file);
		}
		catch(IOException e){
			System.out.println(e.getStackTrace());
		}
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}