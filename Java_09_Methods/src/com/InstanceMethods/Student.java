package com.InstanceMethods;

public class Student {
	String name = "pooja";
	int id = 100;
	
	//syntax
	/*
	  access modifier, return type, method name{
	  //body of the method
	   * return keyword
	  }
	 */

	// method 1
	// method with no parameter and no return type
	public void method2() {
		System.out.println("The id if student is: " + this.id); // returning instance variable
	}

	// method 2
	// method with no parameter and with return type
	public String method1() {
		String name = "Shilpa";
		return name; // returning local variable
	}

	// method 3
	// method with parameter and no return type
	public void method3(int id, String name) {
		System.out.println("The name of student is: " + this.name + " and ID is: " + this.id);
	}

	// method 4
	// method with parameter and with return type
	public String method4(int id, String name) {
		return "The name of student is: " + name + " and ID is: " + id;
	}

	// main method
	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println("The name of student is: " + s1.method1());

		s1.method2();

		s1.method3(12, "Ekta");

		System.out.println(s1.method4(100, "Roopa"));
	}

}
