package com.tutorials.general;

import java.util.Arrays;

public class MultiMap {

	/**
	 * @param args
	 */
	private String [][] multiMap;
	private static int index = 0;
	private int max;
	public MultiMap(int size){
		max = size-1;
		multiMap = new String [size][2];
	}
	
	public static void main(String[] args) {
		MultiMap multiMap = new MultiMap(10);
		multiMap.addElement("Somnath", new String[]{"Upadhyay","aryala"});
		multiMap.addElement("Somnath1", new String[]{"Upadhyay","aryal"});
		
		String [] strArray = multiMap.getValue("Somnath");
		for(String str:strArray)
			System.out.print(str+", ");
		
		strArray = multiMap.getValue("Somnath1");
		for(String str:strArray)
			System.out.print(str+", ");

	}
	
	public boolean addElement(String key, String []values){
		int size = values.length;
		int j=0;
		boolean flag=false;
		for(;j<=this.max;j++){
		if(multiMap[j][0]==key){
			flag = false;
			j++;
			break;
		}else{
			flag=true;
		}
		}
		
		if(!flag){
			System.out.println("Duplicate element not allowed");
			return false;
		}
		
		multiMap[index][0]=key;
		
		String value = null;
		for(String v:values){
			if(value!=null){
				value = value +","+v;
			}else{
				value = v;
			}
			
		}
			
		multiMap[index][1]=value;
		index = index+1;
		return true;
	}
	
	public String[] getValue(String key){
		String value=null;
		for(int j=0; j<=this.max; j++){
			String str = multiMap[j][0]; 
			if(str!=null && str.equals(key)){
				value = multiMap[j][1];
				break;
			}
		}
		String []values = null;
		if(value!=null){
			values = value.split(",");
		}
		return values;
		
	}
	
	public void remove(String key){
		
	}
	

}
