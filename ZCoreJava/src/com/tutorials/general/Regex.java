package com.tutorials.general;

import java.util.Scanner;

public class Regex {
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String input0 = scanner.nextLine();
		System.out.println("Enter Second String");
		String input1 = scanner.nextLine();
		
		if(input0.length()!=input1.length()){
			System.out.println("Strings are not equal..");
			System.exit(-1);
		}
		boolean flag = false;
		char []chars = input0.toCharArray();
		for(char c:chars){
			if(input1.indexOf(c)<0){
				System.out.println("Does not satisfies...");
				System.exit(-1);
			}
		}
		char []chars0 = input1.toCharArray();
		for(char c:chars0){
			if(input0.indexOf(c)<0){
				System.out.println("Does not satisfies...");
				System.exit(-1);
			}
			flag = true;
		}
		if(flag)
			System.out.println("They match the criteria");
	}

}
