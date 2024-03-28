package com.exmp1;

class ClassB{
	int z = 100;
}

public class ClassA extends ClassB{
	int z =10;
	int x = 20;
	

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.z);//10
		
        ClassB b = new ClassB();
        System.out.println(b.z);//100
	}

}
