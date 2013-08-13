package com.zprojects.java.recursive;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factorial factorial = new Factorial();
		System.out.println("Enter a number ..");
		int number = scanner.nextInt();
		
		long fact = factorial.fact(number);
		System.out.println("Factorial of "+number+" is = "+fact);
	}

	private long fact(int number) {
		if(number<=1){
			return 1;
		}
		return (number * fact(number-1));
	}

}
