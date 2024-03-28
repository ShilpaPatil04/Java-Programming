package com.unary;

public class Bitwise_Complement {

	public static void main(String[] args) {
		
		//Bitwise Complement(~)
		//This unary operator returns the one’s complement representation of the input value or operand, i.e, 
		//with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.

		 // Declaring a variable
        int n1 = 6, n2 = -2;
 
        // Printing numbers on console
        System.out.println("First Number = " + n1);
        System.out.println("Second Number = " + n2);
 
        // Printing numbers on console after
        // performing bitwise complement
        System.out.println(
            n1 + "'s bitwise complement = " + ~n1);
        System.out.println(
            n2 + "'s bitwise complement = " + ~n2);
	}

}
