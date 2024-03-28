package com.a.vector;

import java.util.Enumeration;
import java.util.Vector;

//Vector is same like an arrayList it is also having same methods like arrayList
//But vector is synchronized  ArrayList is Non-Synchronized
public class Example1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		for(Integer i : v) {
			System.out.println(i);
		}

		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer ele = e.nextElement();
			System.out.println(ele);
		}

	}

}
