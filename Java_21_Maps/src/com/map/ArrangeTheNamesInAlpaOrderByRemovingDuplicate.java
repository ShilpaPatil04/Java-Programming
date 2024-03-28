package com.map;

import java.util.Scanner;
import java.util.TreeSet;

public class ArrangeTheNamesInAlpaOrderByRemovingDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names:");
	    String str = sc.next();
	    
	    String[] arr = str.split(",");
	    
	    TreeSet<String> names = new TreeSet<String>();
	    for(int i=0;i<arr.length;i++) {
	    	names.add(arr[i]);
	    }
		System.out.println(names);
	}

}
