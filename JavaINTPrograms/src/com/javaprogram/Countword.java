package com.javaprogram;

public class Countword {

	public static void main(String[] args) {
		// Count words in String
		
		String str ="This is Java";
		String[] words = str.split(""); //Ithe space kivha konte character noko deu te aaplyala tycha count dete
		System.out.println("Word count:"+words.length);

	}

}
