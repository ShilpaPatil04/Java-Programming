package com.exmp3;

abstract class Bird {
	abstract void eat();

	abstract void fly();
}

abstract class Eagle extends Bird {
	void fly() {
		System.out.println("Eagle flay at higher height");
	}

	abstract void eat();
}

class SerpentEagle extends Eagle {

	@Override
	void eat() {
		System.out.println("SerpentEagle hunts over mpuntains and eats");

	}

}

class GoldenEagle extends Eagle {

	@Override
	void eat() {
		System.out.println("GoldenEagle hunts over mpuntains and eats");

	}

}

public class Demo {

	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		se.eat();
		se.fly();

		ge.eat();
		ge.fly();

	}

}
