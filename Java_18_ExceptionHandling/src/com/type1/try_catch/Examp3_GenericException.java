package com.type1.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examp3_GenericException {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		Scanner sc = new Scanner(System.in);

//Exception handled using try catch

		try {
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c;
			c = a / b;

			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			int[] ar = new int[size];
			System.out.println("Enter the elements of an array");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = sc.nextInt();
			}
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i] + " ");
			}
			// here I'm checking all possible exceptions
			// and we should write Exception at last because it is a parent

		} catch (ArithmeticException ae) {
			System.out.println("Provide non-zero denominator");
		} catch (NegativeArraySizeException ne) {
			System.out.println("Provide +ve array size");
		} catch (InputMismatchException ie) {
			System.out.println("Provide integer value");
		} catch (ArrayIndexOutOfBoundsException are) {
			System.out.println("Provide valid input");
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		System.out.println("Connection is terminated");
	}

}
