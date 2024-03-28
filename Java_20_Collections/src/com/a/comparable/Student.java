package com.a.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//class CompareName implements Comparator<Student> {
//
//	@Override
//	public int compare(Student s1, Student s2) {
//		String name1 = s1.name;
//		String name2 = s2.name;
//		return name1.compareTo(name2);
//	}
//
//}
//
//class CompareId implements Comparator<Student> {
//
//	@Override
//	public int compare(Student s1, Student s2) {
//		Integer id1 = s1.id;
//		Integer id2 = s2.id;
//		return id1.compareTo(id2);
//	}
//
//}
//
//class CompareMarks implements Comparator<Student> {
//	@Override
//	public int compare(Student s1, Student s2) {
//		Integer m1 = s1.id;
//		Integer m2 = s2.id;
//		return m1.compareTo(m2);
//	}
//}

public class Student implements Comparable<Student> {

	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		String s1 = this.name;
		String s2 = s.name;
		return s1.compareTo(s2);
	}

	public static void main(String[] args) {
		Student s1 = new Student(23, "Shilpa", 63);
		Student s2 = new Student(1, "Arbaz", 33);
		Student s3 = new Student(10, "Zoya", 89);
		Student s4 = new Student(3, "Yasshu", 96);
		Student s5 = new Student(30, "Paddi", 75);

		TreeSet<Student> al = new TreeSet<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		//Collections.sort(al);
		
		

		for (Student st : al) {
			System.out.println(st);
		}

	}

	

}
