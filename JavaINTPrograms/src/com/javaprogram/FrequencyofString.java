package com.javaprogram;

import java.util.HashMap;

public class FrequencyofString {

	public static void main(String[] args) {
		
		String str= "AutomationTesting";
		
		HashMap<Character, Integer> charCountMap=new HashMap<>();
		
		for(char c: str.toCharArray()) {
			
			if(c!=' ') {
				
				charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
				
			}
			
		}
		
		for(char c: charCountMap.keySet()) {
			
			System.out.println(c+":"+charCountMap.get(c));
		}
		
		
		

	}

}
