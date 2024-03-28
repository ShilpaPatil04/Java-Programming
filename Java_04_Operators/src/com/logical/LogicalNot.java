package com.logical;

public class LogicalNot {

	public static void main(String[] args) {
		// Logical NOT operator --> returns boolean values
		   // initializing variables
        int a = 10, b = 1;
 
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
 
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b)); //true
        System.out.println("!(a > b) = " + !(a > b)); //false

	}

}
