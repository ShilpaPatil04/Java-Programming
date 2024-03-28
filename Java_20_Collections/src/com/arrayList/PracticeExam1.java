package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeExam1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(100);
		al.add(30);
		al.add(2);
		al.add(100);

		Collections.sort(al);
		System.out.println(al);

		// simple for loop
		System.out.println("1.Simple For Loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// for each loop
		System.out.println("2.for each loop");
		for (Integer it : al) {
			System.out.println(it);
		}

		// Iterator method
		System.out.println("3.Iterator interface");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ListIterator interface
		System.out.println("4.ListIterator interface");
		ListIterator<Integer> it = al.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// forEach() method
		System.out.println("5.For each method");
		al.forEach(a -> {
			System.out.println(a);
		});

		// forEachRemaining() method
		System.out.println("6.forEachRemaining() method");
		Iterator<Integer> itr1 = al.iterator();
		itr1.forEachRemaining(a -> {
			System.out.println(a);
		});

		System.out.println("Size of an array is:" + al.size());

//		ListIterator<Integer> li =al.listIterator();
//		while(li.hasPrevious()) {
//			System.out.print(li.previous()+" ");
//			System.out.println(li.previousIndex());
//		}

	}

}
