package com.tutorials.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

	/**
	 * @param args
	 */
	private static String FILE_ ="/home/somnath/git/my-pocs/ZCoreJava/src/testinput.txt";
	public static void main(String[] args) throws IOException {
		List<String> readLines = new ArrayList<String>();
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(new File(FILE_)));
		String str="";
		
		int maxLinesize =0;
				
		while((str=br.readLine() )!= null){
			readLines.add(str);
			if(maxLinesize<str.length())
				maxLinesize = str.length();
		}
		
		char before[][] = new char[maxLinesize][readLines.size()];
		int i=0;
		for(String strs:readLines){
			System.out.println(strs);
			for(int j=0;j<strs.length();j++){
				before[j][i]=strs.charAt(j);
			}
			i++;
		}
		
		
		for(int n=0;n<maxLinesize;n++){
			for(int m=0;m<readLines.size();m++)
				System.out.print(before[n][m]);
			System.out.println();
		}
	}

}
