package com.object;

public class Student {
	// Instance Variables
	int id;
	String name;
	float grade;

	// Constructor Declaration of Class
	public Student(int id, String name, float grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// method 1
	public static int getId(int id) {
		return id;
	}

	// method 2
	public static String getName(String name) {
		return name;
	}

	// method 3
	public static float grade(float grade) {
		return grade;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "The student id is " + this.id + ", and student name is " + this.name + ". Student grade is "
				+ this.grade+".";
	}

	public static void main(String[] args) {
		// creating a student1 object
		Student s1 = new Student(101, "Shilpa", 89.00f);
		System.out.println(s1.toString());
		
		// creating a student2 object
		Student s2 = new Student(102, "Rekha", 78.98f);
		System.out.println(s2.toString());

	}

}
