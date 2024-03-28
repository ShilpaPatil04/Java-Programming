package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList0 {

	public static void main(String[] args) {

		// Creating a list
		List<Object> al = new ArrayList<Object>();

		// printing list
		System.out.println(al); // []

		// printing size of a list
		System.out.println(al.size());// 0

//Operation 1: Adding elements to List class using add() method
		// adding elements to the list
		al.add(1);
		al.add(1.1f);
		al.add(null);
		al.add(true);
		al.add("shilpa");
		al.add('z');

		// here adding an element in a particular position specifying(at zero'th
		// position)
		al.add(0, false);

		// after adding printing the list
		System.out.println(al); // [1, 1.1, null, true, shilpa, z]

		// after adding checking the size of a list
		System.out.println(al.size()); // 6

		List<Object> al1 = new ArrayList<Object>();
		al1.add(1);
		al1.add(1.1f);
		al1.add(null);
		// here adding a list with another list
		al.add(al1);
		System.out.println(al);// [1, 1.1, null, true, shilpa, z, [1, 1.1, null]]

//Operation 2: Updating elements in List class using set() method (updating, replacing an element)
		al.set(3, "zzz");
		System.out.println(al);// [false, 1, 1.1, zzz, true, shilpa, z, [1, 1.1, null]]

//Operation 3: Accessing an element in an array (using get() method, for loop, for each loop, Iterator method)
		System.out.println(al.get(1)); // 1
		System.out.println("------ For loop -------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // getting an elements one by one
		}

		System.out.println("------ For each loop -------");
		for (Object a : al) {
			System.out.println(a);
		}

		System.out.println("-------- Using Iterator method -------");
		Iterator<Object> ir = al.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

//Operation 4: Deleting elements
		al.remove(0); // removes single element
		System.out.println(al); // [1, 1.1, zzz, true, shilpa, z, [1, 1.1, null]]

		al.remove(al1); // It removes the another array
		System.out.println(al); // [1, 1.1, zzz, true, shilpa, z]

		al.clear();
		System.out.println(al); // []

		// some methods in list
		al.add(1);
		al.add(1.1f);
		al.add(null);
		al.add(1);
		al.add(1.1f);
		
		// 1>contains(element) --> If list contains element it returns true else returns false
		System.out.println(al.contains(1.1f)); // true
		
//2>indexOf(element) --> If an element is present in a particular index it gives element else -1
		System.out.println(al.indexOf(3)); //-1
		System.out.println(al.indexOf(1)); //0
		
		//3>lastIndexOf(element)
		System.out.println(al.lastIndexOf(1.1f)); //4
		
		//4> isEmpty()
		System.out.println(al.isEmpty()); //false
	}

}
