package com.javaprogram;

public class ConverStringtoChar {

	public static void main(String[] args) {
		// Conver string to char Array
		
		String str="JAVA";
		
		char[] ch=str.toCharArray();
		
		for(char c: ch) {
			
			System.out.println(c);
		}
	}

}
