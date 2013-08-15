package com.zprojects.java.general;

public class StringContentReplacer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		whiteSpaceReplacer("Hello Somnath Upadhyay");
	}
	
	public static String whiteSpaceReplacer(String str){
		char[] str_char = str.toCharArray();
		char[] new_char = new char[str_char.length];
		for(char c:str_char){
			System.out.println(c +" = " +(int)c);
		}
		for(int i=0; i<str_char.length;i++){
			
		}
		return "hello";
	}

}
