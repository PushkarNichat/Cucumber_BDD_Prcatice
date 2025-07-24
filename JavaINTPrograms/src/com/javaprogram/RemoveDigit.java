package com.javaprogram;

public class RemoveDigit {

	public static void main(String[] args) {
		// Remove Digit from string
		
		String str="Prajwal5546466";
		
		String st=str.replaceAll("[0-9]", "");
		
		System.out.println(st);
		

	}

}
