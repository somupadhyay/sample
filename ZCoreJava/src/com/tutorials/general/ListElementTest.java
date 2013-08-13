package com.tutorials.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListElementTest {

	public static void main(String args[]){
		List<String> elements = new ArrayList<String>();
		elements.add("abc");
		elements.add("bcd");
		elements.add("efg");
		elements.add("fgh");
		elements.add("ghi");
		elements.add("hij");
		System.out.println("List before removing ..."+elements.toString());
		int i =0;
		String conditionStr = "ghi";
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()){
			if(iterator.next().equals(conditionStr)){
				iterator.remove();
			}
		}
		
		/*for(String str:elements){
			if(str.equals("fgh")){
				elements.remove(i);
			}
			i++;
			
		}*/

		System.out.println("List after removing ..."+elements.toString());
	}
}
