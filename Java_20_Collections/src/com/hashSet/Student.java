package com.hashSet;

import java.util.HashSet;

public class Student {
     String name;
     int rollNo;
     String city;
     
     Student(String name,int rollNo,String city){
    	 this.name= name;
    	 this.rollNo= rollNo;
    	 this.city= city;
     }
     
     public String getName() {
    	 return name;
     }
	
     public int getRollNo() {
    	 return rollNo;
     }
     
     public String getCity() {
    	 return city;
     }
     
     
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student("Shilpa",1,"Gokak");
		Student s2 = new Student("Sumit",2,"Konnur");
		Student s3 = new Student("Rani",3,"Belagavi");
		
		HashSet<Student>  hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//System.out.println("\n"+hs);
		
		for(Student s : hs) {
			System.out.println(s);
		}
	}

}
