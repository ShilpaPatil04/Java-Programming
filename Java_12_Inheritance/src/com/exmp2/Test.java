package com.exmp2;

class plane{
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
}

class cargoplane extends plane{
	
}

class pasengerpalne extends plane{
	
}

public class Test {

	public static void main(String[] args) {
		cargoplane cp = new cargoplane();
		pasengerpalne pp = new pasengerpalne();
		cp.fly();
		cp.takeoff();
		
		pp.fly();
		pp.takeoff();

	}

}
