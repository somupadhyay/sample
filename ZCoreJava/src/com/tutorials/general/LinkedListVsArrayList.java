package com.tutorials.general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class LinkedListVsArrayList {

	/**
	 * @param args
	 */
	private static final String inputformat = "ill-xxxx \t: to insert into linkedlist \n"
			+ "sll-xxxx \t: to search element in linkedlist \n"
			+ "ill-F/L/Ixxxx-xxxx \t: to insert element in linkedlist at specified location\n"
			+ "gll-F/L/Ixxxx \t: to Fetch element from linkedlist at specified location\n"
			+ "rll-F/L/Ixxxx \t: to remove the element from linkedlist at specified location\n"
			+ "ial-xxxx \t: to insert into arraylist\n"
			+ "sal-xxxx \t: to search element in arraylist \n"
			+ "ial-F/L/Ixxxx-xxxx \t: to insert element in arraylist at specified location\n"
			+ "gal-F/L/Ixxxx \t: to Fetch element from arraylist at specified location\n"
			+ "ral-F/L/Ixxxx \t: to remove the element from arraylist at specified location\n"
			+ "exit \t: to exit\n"
			+ "help \t: for help";

	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your input in following format\n"+inputformat);
		boolean progress = true;
		Pattern pattern = Pattern.compile("");
		while(progress){
			String nextLine = scanner.nextLine();
		}
	}

}
