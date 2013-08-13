package com.tutorials.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fabonacci {
	
	public static void main(String args[]) throws IOException{
		
		System.out.println("Emter the number for which you want fabonacci series.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		int[] fabo = new int[num+1];
		int next=0;
		fabo[0]=next=1;
		int sum = 0;
		for(int i =0; i<num;i++){
			sum = fabo[i]+next;
			fabo[i+1] = next;
			next = sum;
		}
		for(int i:fabo){
			System.out.println(i + ",");
		}
		
	}

}
