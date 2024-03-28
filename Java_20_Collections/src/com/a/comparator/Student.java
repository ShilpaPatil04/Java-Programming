package com.a.comparator;

import java.util.TreeSet;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;
	float height;

	public Student(int id, String name, int marks, float height) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", height=" + height + "]";
	}

	// Comparing by name
//    public int compareTo(Student s2) {
//    	String i1 = this.name;
//    	String i2 = s2.name;
//    	return i1.compareTo(i2);
//    }

	public int compareTo(Student s2) {
		Integer i1 = this.marks;
		Integer i2 = s2.marks;
		return i1.compareTo(i2);
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "shilpa", 23, 3.4f);
		Student s2 = new Student(25, "rani", 100, 5.4f);
		Student s3 = new Student(13, "anup", 36, 2.4f);
		Student s4 = new Student(10, "abhi", 65, 4.4f);
		Student s5 = new Student(100, "mahi", 93, 6.3f);

		TreeSet<Student> stu = new TreeSet<Student>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);

		for (Student stud : stu) {
			System.out.println(stud);
		}
	}

}
