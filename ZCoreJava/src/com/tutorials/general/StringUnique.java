package com.tutorials.general;

import java.util.Arrays;
import java.util.Scanner;

public class StringUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:..");
		String str = scanner.nextLine();
		System.out.println("String is made of unique chars ?"+isUniqueChars2(str));

	}
	
	public static boolean isUniqueChars2(String str){
		boolean[] char_set = new boolean[256];
		System.out.println(Arrays.toString(char_set));
		for(int i=0; i < str.length(); i++){
			int val = str.charAt(i);
			System.out.println(val);
			if(char_set[val]) return false;
			char_set[val]=true;
		}
		System.out.println(Arrays.toString(char_set));
		return true;
	}

}
