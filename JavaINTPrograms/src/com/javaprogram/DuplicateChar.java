package com.javaprogram;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="adgsstff";
		String result="";
		
		for(int i=0; i<input.length();i++) {
			
			char ch=input.charAt(i);
			
			if(result.indexOf(ch)==-1) {
				result +=ch;
			}
		}
		
		System.out.println("Without Duplicate:"+result);

	}

}
