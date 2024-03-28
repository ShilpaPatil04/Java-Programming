package com.unary;

public class Not_Operator {

	public static void main(String[] args) {
		
		//! Operator
		//This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
		
		//Example: 1
		boolean isRaining = true;
		System.out.println(!isRaining);
		
		//Example :2
		// Initializing variables
        boolean cond = true;
        int a = 10, b = 1;
 
        // Displaying values stored in above variables
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
 
        // Displaying values stored in above variables
        // after applying unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
		
	}

}
