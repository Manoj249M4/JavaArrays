package com.java.miscprograms;

public class ThisKeywordExample {

	public static void main(String[] args) {
		ThisKeywordExample obj1 = new ThisKeywordExample();
		System.out.println("Object1 calling method1 "+obj1);
		obj1.methodOne();
		System.out.println("...................");
		ThisKeywordExample obj2 = new ThisKeywordExample();
		System.out.println("Object1 calling method1 "+obj2);
		obj2.methodOne();
	}
	private void methodOne(){
		System.out.println("this keyword points to "+this);
	}
}
