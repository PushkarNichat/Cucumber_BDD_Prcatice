package com.javaprogram;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Jai BajrangBali";
		int count=0;
		char ch='a';
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println("Count :"+count);

	}

}
