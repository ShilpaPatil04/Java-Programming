package com.relational;

public class GreaterThanOrEqual {

	public static void main(String[] args) {
		// Greater Than or equal to Operator --> returns boolean value
		// Initializing variables
        int var1 = 20, var2 = 20, var3 = 10;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 >= var2: "
                           + (var1 >= var2)); //true
 
        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 >= var3: "
                            + (var2 >= var3)); //true

	}

}
