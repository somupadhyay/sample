package com.zprojects.java.recursive;

public class IntReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverse(910));

	}
	
	public static String reverse(int num){
		if(num==0)
			return "";
		
		return num%10+reverse(num/10);
	}

}
