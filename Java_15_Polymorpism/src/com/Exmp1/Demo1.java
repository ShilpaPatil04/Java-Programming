package com.Exmp1;

class plane {

	void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends plane {
	void fly() {
		System.out.println("CargoPlane is flying at low height");
	}
}

class PasengerPalne extends plane {
	void fly() {
		System.out.println("PasengerPlane is flying at medium height");
	}
}

class FighterPalne extends plane {
	void fly() {
		System.out.println("PasengerPlane is flying at high height");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		//child reference to child object, here tight coupling will going to happen
		CargoPlane cp = new CargoPlane();
		PasengerPalne pp = new PasengerPalne();
		FighterPalne fp = new FighterPalne();
		
		plane ref; //plane ref = new plane();
		ref=cp; //
		ref.fly();
		
	    ref = pp;
	     ref.fly();
	    
	    ref = fp;
	    ref.fly();
	    		
		
//here we are achieved polymorphism but because of tight coupling we can't use specialized methods of sub class
	}

}
