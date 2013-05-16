package com.tutorials.general;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumTest {
	
	public static void main(String args[]){
		MONTH lastMonth = MONTH.DECEMBER;
		System.out.println("The last month of a year is : Ordinal = "+lastMonth.ordinal()+" Name = "+lastMonth.name());
		List<String> mylist = new ArrayList<String>();
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		mylist.add("d");
		mylist.add("e");
		
		Vector<String> myVector = new Vector<String>();
		myVector.addElement("somnath");
		myVector.add("upadhyay");
		Enumeration<String> myEnumeration = myVector.elements();
		while(myEnumeration.hasMoreElements()){
			System.out.println(myEnumeration.nextElement());
		}
		
	}

}
