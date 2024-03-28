package com.a.LinkedList;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.addFirst(100);
		l.addLast(200);
		System.out.println("getFirst(): " + l.getFirst());
		System.out.println("getLat(): " + l.getLast());

		System.out.println();
		l.forEach(a -> {
			System.out.println(a);
		});

		System.out.println(l.removeFirst());
		System.out.println();
		l.forEach(a -> {
			System.out.println(a);
		});

		System.out.println();
		System.out.println();

	}

}
