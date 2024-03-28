package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int rollNum = 0;
	private String name = null;
	private int marks = 0;

	public Student(int rollNum, String name, int marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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

	public String toString() {
		return  "["+rollNum + "  " + name + "  " + marks+"]";
	}
	
	
}

public class CustomArrayList {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s = new Student(1,"Shilpa",56);
	    al.add(s);
	    
	    Student s1 = new Student(2,"Avi",36);
	    al.add(s1);
	    
	    Student s2 = new Student(3,"Sush",23);
	    al.add(s2);
	    
	    Student s3 = new Student(4,"Shilpa",56);
	    al.add(s3);
	    System.out.println(al);

	}

}
