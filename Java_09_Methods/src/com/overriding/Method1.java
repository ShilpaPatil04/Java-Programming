package com.overriding;

class plane {

	void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends plane {
	//method overriding
	void fly() {
		System.out.println("CargoPlane is flying at low height");
	}
}

class PasengerPalne extends plane {
	//method overriding
	void fly() {
		System.out.println("PasengerPlane is flying at medium height");
	}
}

class FighterPalne extends plane {
	//method overriding
	void fly() {
		System.out.println("PasengerPlane is flying at high height");
	}
}

public class Method1 {

	public static void main(String[] args) {
		// child reference to child object, here tight coupling will going to happen
		CargoPlane cp = new CargoPlane();
		PasengerPalne pp = new PasengerPalne();
		FighterPalne fp = new FighterPalne();
		cp.fly();
		pp.fly();
		fp.fly();

	}

}
