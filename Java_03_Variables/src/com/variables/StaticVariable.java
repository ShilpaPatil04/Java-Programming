package com.variables;

public class StaticVariable {
	//Static variables must write after the class
	//if we don't initialize static variable the JVM provides default values
	static int a;
	static String s;
	static String s1 ="Shilpa";
	
	//method
	public static void method1() {
		//It throws an error declaring a static variables are inside a method is not allowed
		//static int x;
	}
	

	public static void main(String[] args) {
		//Static variables can be called without creating an object
		//Static variables can be called directly or also called by using class name
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.s);
		System.out.println(StaticVariable.s1);
	}

}
