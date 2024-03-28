package com.Exmp2;

class plane {

	void fly() {
		System.out.println("Plane is flying");
	}

	void takeoff() {
		System.out.println("Plane is taking off");
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

	void carryWepons() {
		System.out.println("FighterPlane is carrying weapons");
	}
}

public class Demo {

	public static void main(String[] args) {
		// child reference to child object, here tight coupling will going to happen
		CargoPlane cp = new CargoPlane();
		PasengerPalne pp = new PasengerPalne();
		FighterPalne fp = new FighterPalne();

		plane ref; // plane ref = new plane();
		ref = cp; //
		ref.takeoff();
		ref.fly();

		ref = pp;
		ref.takeoff();
		ref.fly();

		ref = fp;
		ref.takeoff();
		ref.fly();
		// here im calling specialized method of sub class it throws an error because, parent doesn't know child class methods
		//using parent class reference we can't call  specialized methods of child class, we need to downcast it
		((FighterPalne)ref).carryWepons();

	}

}
