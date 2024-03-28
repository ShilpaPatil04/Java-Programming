package com.Exmp3;


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
	void carryCargo() {
		System.out.println("CargoPlane is carrying cargos");
	}

}

class PasengerPalne extends plane {
	void fly() {
		System.out.println("PasengerPlane is flying at medium height");
	}
	void carryPasengers() {
		System.out.println("PasengerPlane is carrying pasengers");
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

class Airport {
	void permit(plane ref) {
		ref.takeoff();
		ref.fly();
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PasengerPalne pp = new PasengerPalne();
		FighterPalne fp = new FighterPalne();

		Airport a = new Airport();
		
		a.permit(cp);
		System.out.println();
		
		a.permit(pp);
		System.out.println();
		
		a.permit(fp);

	}

}

