package com.zprojects.java.recursive;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]){
		Fibonacci fiboObj = new Fibonacci();
		System.out.println("Enter a number for which you want Fibonacci series");
		Scanner scanner = new Scanner(System.in);
		int fibonum = scanner.nextInt();
		for(int i=0; i<=fibonum;i++){
			System.out.println(fiboObj.fibo(i));
		}
	}

	public int fibo(int n){
		if(n<=1)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
}
