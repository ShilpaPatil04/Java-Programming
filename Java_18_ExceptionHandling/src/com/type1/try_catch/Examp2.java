package com.type1.try_catch;

import java.util.Scanner;

public class Examp2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();

		System.out.println("Enter b");
		int b = sc.nextInt();
		int c;
//Exception handled using try catch
		try {
			c = a / b;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Abnormal termination");
			System.out.println("Don't provide zero as denominator");
		}

	}
}
