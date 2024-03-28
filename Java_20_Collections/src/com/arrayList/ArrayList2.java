package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {

		List<Object> al = new ArrayList<Object>();
		al.add(1);
		al.add(1.1f);
		al.add(null);
		al.add(true);
		al.add("shilpa");
		al.add('z');

		// In ArrayList we are having two remove() methods, one removes index element,
		// another removes element
		// if element and index are same then it removes the element which is present in
		// a particular index
		al.remove(1);
		// al.remove(1);
		System.out.println(al);

//still if we want to remove particular element we are having method valueOf()
		al.remove(Integer.valueOf(1)); // it removed element '1'
		System.out.println(al);
	}

}
