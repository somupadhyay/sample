package com.zprojects.java.general;

import java.util.Scanner;

public class GeneralProgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		int result =0;
		for(int i=0; i<num1;i++){
			for(int j=0; j<num2; j++){
				result++;
			}
		}
		System.out.println(result);

	}

}
