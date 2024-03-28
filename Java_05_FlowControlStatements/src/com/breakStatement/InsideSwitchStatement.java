
package com.breakStatement;

public class InsideSwitchStatement {

	public static void main(String[] args) {
		// Declaring a variable for switch expression
		int numb = 20;

		// Switch expression
		switch (numb) {

		// Case statements
		case 10:
			System.out.println("TEN");

			// Break keyword to suspend the switch case
			// if given condition is fulfilled
			break;

		case 20:
			System.out.println("TWENTY");
			break;

		case 30:
			System.out.println("THIRTY");
			break;

		// Default case statement
		default:
			System.out.println("INFINITE");
		}
	}

}
