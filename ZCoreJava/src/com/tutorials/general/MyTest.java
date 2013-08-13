package com.tutorials.general;

public class MyTest {
	
	public static void main(String[] args) {
		MyNoMutableClass myNonMutableClass1 = new MyNoMutableClass();
		MyNoMutableClass myNonMutableClass2 = new MyNoMutableClass(1,"somnath","upadhyay");
		
		System.out.println("Default object " + myNonMutableClass1);
		System.out.println("Object with Value " + myNonMutableClass2);
		
		myNonMutableClass1.setLname("som");
		System.out.println("After I modified it "+myNonMutableClass1);
		
		MyNoMutableClass myNonMutableClass3 = myNonMutableClass2;
		System.out.println("Refering the other class "+myNonMutableClass3);
	}

}
