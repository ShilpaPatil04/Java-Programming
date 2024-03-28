package com.publicModifer;

import com.protectedPackage_1.Demo1;

public class Exmp1 {

	public static void main(String[] args) {
		//here we are accessing Z class from different class because it is public
		Z z = new Z();
		z.display();
		
		//here we are accessing Demo1 class from different package because it is public
		Demo1 d = new Demo1();
		System.out.println(d.name);

	}

}
