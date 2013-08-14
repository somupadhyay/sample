package com.tutorials.general;

public class ClassABImplementer implements ClassA, ClassB{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassA classa = new ClassABImplementer();
		ClassB classb = new ClassABImplementer();
		System.out.println(classa.max(10, 20));
		System.out.println(classb.max(20, 10));
		classb = (ClassB) classa;
		System.out.println(classb.max(20, 10));
	}

	@Override
	public int max(int num1, int num2) {
		return num1>=num2?num1:num2;
	}

}
