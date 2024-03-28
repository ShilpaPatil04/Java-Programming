package com.variables;

public class Global_Variables {
	//Global variable
	int a;
	String str;
	
	public static void main(String[] args) {
		Global_Variables  gv = new Global_Variables ();
		//For global variables JVM provides default values
		//For global variables it is OK if we doesn't initialize a variable
		System.out.println(gv.a); //0
		System.out.println(gv.str); //null
	}

}
