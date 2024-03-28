package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Unmodifiable list
public class ArrayList3 {

	public static void main(String[] args) {
System.out.println("---------- One way of Unmodifiable list using array -----------");
		Integer[] arr = { 1, 2, 3, 4, 5 };
		// adding array to an List
		//ArrayList<Integer> al = (ArrayList<Integer>) Arrays.asList(arr);
		List<Integer> al = Arrays.asList(arr);
		// printing an arrayList
		System.out.println("printing an arrayList");
		System.out.println(al);

//modifying an element in an array		
		System.out.println("modifying an element in an array , it affected in arrayList");
		arr[2] = 100;
		// so that it also affected in arraylist
		System.out.println(al);

		// modifying in arrayList
		al.set(0, 222);
		System.out.println("modifying in arrayList so that it affected in array");
		for (Integer i : arr) {
			System.out.println(i);
		}
		
		//so the conclusion is when we modify in array or arraylist it will affect in both
       //It is possible to modify array and list but not add new element to an array
		//al.add(44);
		
		//remove() is not allowed
		//al.remove(5);
		
		//al.clear() is not allowed
		System.out.println(al);
		
		//Another way of unmodifiable list
		System.out.println("---------- Another way of Unmodifiable list using List.of() -----------");
		List<String> l = List.of("Java","Python","C","C++");
		System.out.println(l);
		
		//not allowed
//		l.add("AB");
//		l.remove(0);
//		l.clear();
		
	}

}
