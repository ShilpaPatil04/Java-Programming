package com.arithmetic;

public class Java_03_Variables {
	//static variable
	static int a =10;
    public int c= 20;
	public static void main(String[] args) {
		//Variables in Java:
		//3 types
		/*
		   1> Local Variable
		   2> Global Variable
		   3> Static variable
		 */
		
		 // Declared a Local Variable
		// This variable is local to this main method only
		int a=100;
		System.out.println(a); //100
		
		System.out.println(Java_03_Variables.a); //10
		
		//System.out.println(c);

	}

}
