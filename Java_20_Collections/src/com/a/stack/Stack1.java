package com.a.stack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;

//Stack means Last In First Out(LIFO)
public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> sk = new Stack<Integer>();
		//push method
		sk.push(1);
		sk.push(2);
		sk.push(3);
		sk.push(4);
		//Collections.sort(sk);
		System.out.println(sk); //[1, 2, 3, 4]
		
		//pop method()
		Integer i =sk.pop();
		System.out.println(i); //the element removed is 4
		System.out.println(sk); //[1,2,3]
		
		//peek() method
		Integer i1 = sk.peek();
		System.out.println(i1);//3   --> this is the top element
		
		
		//search() method
		int a =sk.search(1); //3
		System.out.println(a);
		
		//when the element is not present
		int a2 =sk.search(12);
		System.out.println(a2); //-1
		
		//isEmpty() method
		System.out.println(sk.isEmpty());
		
		sk.pop();
		sk.pop();
		System.out.println(sk);
		
		
		Stack<Integer>s = new Stack<Integer>();
		s.push(999);
		s.push(888);
		s.push(777);
		s.push(666);
		s.push(555);
		System.out.println(s);
		
		System.out.println("Traversing by for-loop");
		for(Integer s1 : s) {
			System.out.println(s1);
		}
		s.pop();
		System.out.println(s);
		
		System.out.println("Traversing by Enumeration");
		Enumeration<Integer> e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
