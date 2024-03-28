package com.diffArrayLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//Adding elements
		//ArrayList
		long numOfElements = 100000;
		List<Integer> al = new ArrayList<>();
		long StartTime1 = System.nanoTime();
		for (int i = 0; i < numOfElements; i++) {
			al.add(i);
		}
		long EndTime1 = System.nanoTime();
		System.out.println("To add an elements the arrayList takes time= " + (EndTime1 - StartTime1));

		//LinkedList
		List<Integer> ll = new LinkedList<>();
		long StartTime2 = System.nanoTime();
		for (int i = 0; i < numOfElements; i++) {
			ll.add(i);
		}
		long EndTime2 = System.nanoTime();
		System.out.println("To add an elements the LinkedList takes time= " + (EndTime2 - StartTime2));

		//Accessing elements
		//arrayList
		long StartTime3 = System.nanoTime();
		for (int i = 0; i < numOfElements; i++) {
			al.get(i);
		}
		long EndTime3 = System.nanoTime();
		System.out.println("To access the elements the arrayList takes time= " + (EndTime3 - StartTime3));

		//LinkedList
		long StartTime4 = System.nanoTime();
		for (int i = 0; i < numOfElements; i++) {
			ll.get(i);
		}
		long EndTime4 = System.nanoTime();
		System.out.println("To access the elements the LinkedList takes time= " + (EndTime4 - StartTime4));
	}

}
