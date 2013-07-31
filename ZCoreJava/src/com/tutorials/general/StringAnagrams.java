package com.tutorials.general;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First string");
		String str1= scanner.nextLine();
		System.out.println("Second String");
		String str2= scanner.nextLine();
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("The String are anagram ? .."+(Arrays.equals(arr1, arr2)?"YES":"NO"));
		
	}

}
