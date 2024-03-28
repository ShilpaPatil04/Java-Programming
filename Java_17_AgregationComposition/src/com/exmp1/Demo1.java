package com.exmp1;

//defining a charger class
class Charger {
	private String brand;
	private float voltage;

	//constructor for charger class
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	//getter and setter for charger class
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

}

class OS {
	private String name;
	private int size;

	//Constructor for OS class that sets the name and size properties
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	//getter and setter method properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

//define mobile class that as an OS and a method that takes a Charger object
class Mobile{
	OS o1 = new OS("Android",512);
	 
	//Method that takes Charger object and prints it's brand and voltage properties
	void hasACharger(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}

//Define a class Demo1 that demonstrates the use of the other classes 
public class Demo1 {

	public static void main(String[] args) {
		Charger c = new Charger("MI", 24.52f);
		//Create a Mobile objecr and prints it's OS name and size properties
       Mobile m = new Mobile();
       System.out.println(m.o1.getName());
       System.out.println(m.o1.getSize());
    //call the hasACharger() method of the Mobile Object with Charger object as an argument   
       m.hasACharger(c);
     //Set the Mobile object to null(deallocate memory)  
       m = null;
      
       
       //Try to access properties of the Mobile object and class it's method but it will throw a nullPointerException as the object is null
//       System.out.println(m.o1.getName());
//       System.out.println(m.o1.getSize());
       
       System.out.println(c.getBrand());
       System.out.println(c.getVoltage());

	}

}
