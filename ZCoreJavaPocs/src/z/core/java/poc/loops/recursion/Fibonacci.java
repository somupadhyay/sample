package z.core.java.poc.loops.recursion;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
/*		int num = scanner.nextInt();
		for(int i=0; i<=num; i++){
			System.out.println(fibo.fibo(i));
		}
		*/
		System.out.println("Enter first String");
		String str1 = scanner.nextLine();
		System.out.println("Enter Second String");
		String str2 = scanner.nextLine();
		System.out.println("They are made of same char ? = "+fibo.checkString(str1,str2));
	}

	public int fibo(int n){
		if(n<=1){
			return 1;
		}
		return (fibo(n-1) + fibo(n-2));
	}
	
	public boolean checkString(String str1, String str2){
		int str1Value =0;
		int str2Value =0;
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		for(char c:str1Chars){
			str1Value += (int)c;
		}
		
		for(char cs:str2Chars){
			str2Value += (int)cs;
		}
		
		return str1Value==str2Value;
		
	}
}
