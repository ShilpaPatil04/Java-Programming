package com.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {
		// Instantiate an object of HashSet
		HashSet<ArrayList> set = new HashSet<>();

		// create ArrayList list1
		ArrayList<Integer> list1 = new ArrayList<>();

		// create ArrayList list2
		ArrayList<Integer> list2 = new ArrayList<>();

		// Add elements using add method
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(2);
		set.add(list1);
		set.add(list2);

		// print the set size to understand the
		// internal storage of ArrayList in Set
		System.out.println(set.size());

		ArrayList<Float> al = new ArrayList<Float>();
		al.add(3.4f);
		al.add(9.8f);

		HashSet<Float> hs = new HashSet<Float>();
		hs.add(6.3f);
		hs.add(5.2f);
		hs.add(6.1f);
		hs.addAll(al);

		for (Float f : hs) {
			System.out.println(f);
		}

	}

}
