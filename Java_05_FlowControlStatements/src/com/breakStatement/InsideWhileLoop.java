package com.breakStatement;

public class InsideWhileLoop {

	public static void main(String[] args) {
		// While loop for iteration

		// Creating and initializing variable
		// outside loop
		int i = 35;

		// Condition check
		while (i >= 10) {
			if (i == 15) {
				// Using Break keyword to suspend
				// loop when i become 15

				// Decrementing variable initialized above
				i--;

				// Break statement
				break;
			}

			// Printing elements showcasing break
			System.out.print(i + " ");
			i--;
		}

	}

}
