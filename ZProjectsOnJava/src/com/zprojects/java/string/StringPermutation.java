package com.zprojects.java.string;

import java.util.Scanner;

public class StringPermutation {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string..");
		String firstString = scanner.nextLine();
		System.out.println("Enter first string..");
		String secondString = scanner.nextLine();
		System.out.println("Enable Case Sensetive true/false..");
		
		
		
		char []firstChars = firstString.toCharArray();
		System.out.println(firstString.hashCode()==secondString.hashCode());
		int firstSum=0;
		for(char ch:firstChars){
			firstSum +=(int)ch;
		}
		char []secondChars = secondString.toCharArray();
		int secondSum=0;
		for(char ch:secondChars){
			secondSum +=(int)ch;
		}
		if(firstSum!=secondSum){
			System.out.println("Both string are not made of same chars...");
			System.exit(-1);
		}
		System.out.println(firstString +" and "+ secondString+" made out of same chars");
	}

}
