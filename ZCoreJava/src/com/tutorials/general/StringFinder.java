package com.tutorials.general;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line..");
		String line = scanner.nextLine();
		System.out.println("Enter String to be found..\n");
		String str = scanner.nextLine();
		Pattern pattern = Pattern.compile(str);
		Matcher match = pattern.matcher(line);
		int count =0;
		while(match.find()){
			count++;
		}
		System.out.println(str+".. occured "+count+" times in "+line);

	}

}
