package com.coll;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("A");
		a.add("B");
		a.add(null);
		a.set(0,11);
		a.add(1,"AA");
		a.set(1,"AA");
		System.out.println(a);
		
	}

}
