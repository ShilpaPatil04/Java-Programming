package com.exmp1;

//Inheritance is nothing but child class can acquire all properties and behaviors of parent
//Class B is parent class, it is having variables and methods and constructors
class B{
	int id;
	String name;
	int marks;
	
	public B(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks = marks;
	}
	
	public int  displayId(int id) {
		id = id+1;
		return id;
	}
	
	public int displayMarks(int marks) {
		marks = marks-2;
		return marks;
	}
	
	public String toString() {
		return "The name is: " + this.name+ " and marks is: "+ this.marks + " and id is: "+ this.id;
	}
}

//class A is a child class By default all properties and behaviors derived
public class A extends B{

	public A(int id, String name, int marks) {
		super(id, name, marks);
		this.id = 1000;
	}

	public static void main(String[] args) {
		
      A a = new A(1,"Shilpa",1234);
     System.out.println(a.toString());
	}

}
