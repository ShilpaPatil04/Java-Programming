package com.unary;

public class Increment_decrement {

	public static void main(String[] args) {
		//Increment Operation
		System.out.println("------ Increment Operation -------");
		int a =10;
		int b =20;
		//post increment  --> use, assign then increment
		System.out.println("post increment: "+ a++); //10
		
		//pre increment  -->increment, use then assign
		System.out.println("pre increment: "+ ++b); //21
		
		//After both post increment and pre increment the value of a and b are
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		//Decrement Operation
		System.out.println("------- Decrement Operation ---------");
		//post decrement  --> use, assign then decrement
		System.out.println("post decrement: "+ --a); //10
		
		//pre decrement  --> decrement, use then assign
		System.out.println("pre decrement: "+ b--); //21
		
		
		//After both post decrement and pre decrement the value of a and b are
		System.out.println("a: "+a); //10
		System.out.println("b: "+b); //20

	}

}
