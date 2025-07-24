package com.javaprogram;

public class CountVowelsandConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Quality".toLowerCase();
		
		int Vowels=0;
		int Conconent=0;
		
		for(int i=0;i<input.length();i++) {
			
			char ch=input.charAt(i);
			
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					
					Vowels++;
				}else {
					Conconent++;
				}
			}
		}
		
		System.out.println("Vowels=" + Vowels +"Consonents="+Conconent);

	}

}
