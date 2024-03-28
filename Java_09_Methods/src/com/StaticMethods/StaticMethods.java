package com.StaticMethods;

public class StaticMethods {

	// method: 1
	// The method without parameter and without return type
	public static void withoutParameterWithoutReturnType() {
		int a = 10;
		int b = 20;
		System.out.println("The method without parameter and without returntype: " + (a + b));
	}

	// method: 2
	// The method without parameter and with return type
	public static int withoutParameterWithReturnType() {
		int a = 100;
		int b = 200;
		return a + b;
	}

	// method: 3
	// The method with parameter and without return type
	public static void withParameterWithoutReturnType(int a, int b, int c) {
		System.out.println("The method with parameter and without returntype: " + (a + b + c));
	}

	// method :4
	// The method with parameter and with return type
	public static int withParameterWithReturnType(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		// here I'm calling static method with class name
		StaticMethods.withoutParameterWithoutReturnType();

		// here I'm calling static method with class name
		System.out.println(
				"The method without parameter and with returntype: " + StaticMethods.withoutParameterWithReturnType());

		// here I'm calling static method with class name
		StaticMethods.withParameterWithoutReturnType(10, 20, 30);

		// here I'm calling static method with class name
		System.out.println(
				"The method with parameter and with returntype: " + StaticMethods.withParameterWithReturnType(1,2,3));

	}

}
