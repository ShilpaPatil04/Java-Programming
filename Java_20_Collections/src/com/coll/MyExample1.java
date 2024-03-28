package com.coll;

import java.util.TreeSet;



class Student1{
	private String Name;
	private int R_No;
	private String City;
	
	public Student1() {
		
	}
	
	public Student1(String name, int r_No, String city) {
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




public class MyExample1 {

	public static void main(String[] args) {
		 Student1 s1 = new Student1("Shilpa",1,"Dubai");
	     Student1 s2 = new Student1("Reema",6,"Hasan");
	     Student1 s3 = new Student1("Uma",2,"Amboli");
         Student1 s4 = new Student1("Ani",5,"Belagavi");
         Student1 s5 = new Student1("jyoo",3,"Orisa");

	        TreeSet<Student1> ts = new TreeSet<Student1>();
	        ts.add(s1);
	        ts.add(s2);
	        ts.add(s3);
	        ts.add(s4);
	        ts.add(s5);
	        
	        for(Student1 list : ts) {
	        	System.out.println(list);
	        }
	        
	}

}
