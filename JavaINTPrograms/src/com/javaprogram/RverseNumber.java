package com.javaprogram;

public class RverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=12345;

String st = Integer.toString(i);
System.out.println(st.getClass().getSimpleName());

StringBuilder s=new StringBuilder(st);
StringBuilder rev=s.reverse();

String revString = rev.toString();

System.out.println("Reverse number in String datatype: "+ revString);
// Converting String to Integer
int revNum = Integer.parseInt(revString);
Object obj = revNum;
System.out.println(obj.getClass().getSimpleName());

System.out.println("Reverse number in Integer datatype: "+revNum);




	}

}
