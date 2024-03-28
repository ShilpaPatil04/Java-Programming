package com.exmp1;

abstract class plane {
	// abstract method
	abstract void takeoff();
}

class cargoPlane extends plane {
//implemented class
	@Override
	void takeoff() {
		System.out.println("Cargo plane is taking off");

	}

}

class pasengerPalne extends plane {

	@Override
	void takeoff() {
		System.out.println("Pasenger plane is taking off");

	}

}

public class Demo1 {

	public static void main(String[] args) {
		cargoPlane cp = new cargoPlane();
		pasengerPalne pp = new pasengerPalne();
		cp.takeoff();
		pp.takeoff();

	}

}
