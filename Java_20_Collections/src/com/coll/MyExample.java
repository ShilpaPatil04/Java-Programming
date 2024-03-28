package com.coll;

import java.util.ArrayList;

class Student{
	private String Name;
	private int R_No;
	private String City;
	
	public Student() {
		
	}
	
	public Student(String name, int r_No, String city) {
		super();
		Name = name;
		R_No = r_No;
		City = city;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getR_No() {
		return R_No;
	}

	public void setR_No(int r_No) {
		R_No = r_No;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	public String toString() {
		return "[Name=" + Name + ", R_No=" + R_No + ", City=" +  City +"]";
	}
	
}



public class MyExample {

	public static void main(String[] args) {
		
        Student s1 = new Student("Shilpa",1,"Dubai");
        Student s2 = new Student("Reema",6,"Hasan");
        Student s3 = new Student("Uma",2,"Amboli");
        Student s4 = new Student("Ani",5,"Belagavi");
        Student s5 = new Student("jyoo",3,"Orisa");
        
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        
        for(Student stu : al) {
        	System.out.println(stu);
        }
	}

}
