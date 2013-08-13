package com.zprojects.java.string;

import java.util.Scanner;

public class StringIsSubString {

	public static void main(String[] args) {
		OtherSolution otherSolution = new OtherSolution();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first String : _");
		String mainString = scanner.nextLine();
		System.out.print("Enter second String : _");
		String subString = scanner.nextLine();
		boolean isSubstring = false;
		
		long current = System.currentTimeMillis();
		if (mainString.indexOf(subString) >= 0) {
			isSubstring = true;
		}
		
		System.out.println(subString + " String "
				+ (isSubstring ? "is a" : "is not a") + " substring of String "
				+ mainString);
		System.out.println("it took .. "+(System.currentTimeMillis()-current)+"mili seconds");
		System.out.println("####### printing other solution #################");
		
		current = System.currentTimeMillis();
		
		System.out.println(subString + " String "
				+ (otherSolution.isSubString(mainString, subString) ? "is a" : "is not a") + " substring of String "
				+ mainString);

		System.out.println("it took .. "+(System.currentTimeMillis()-current)+"mili seconds");
	}

}

class OtherSolution {

	public boolean isSubString(String mainString, String subString) {
		boolean flag = false;
		char mainChar[] = mainString.toCharArray();
		char subChar[] = subString.toCharArray();
		int i, j;
		i = j = 0;
		for (j = 0; j < mainChar.length; j++) {
			if (subChar[i] == mainChar[j]) {
				if (i == subChar.length - 1) {
					flag = true;
					break;
				}
				i++;
				continue;
			}else{
				i=0;
			}
		}

		return flag;
	}
}
