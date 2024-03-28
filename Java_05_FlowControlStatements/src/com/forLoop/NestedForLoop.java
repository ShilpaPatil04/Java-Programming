package com.forLoop;

public class NestedForLoop {

	public static void main(String[] args) {
		   // Printing a 1 to 5 (5 times)
        // first loop
        for (int i = 1; i <= 5; i++) {
            // second loop
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
