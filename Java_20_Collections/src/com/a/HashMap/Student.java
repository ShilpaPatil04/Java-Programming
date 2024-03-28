package com.a.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	int id;
	String letter;

	public Student(int id, String letter) {
		super();
		this.id = id;
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Example2 [id=" + id + ", letter=" + letter + "]";
	}

	public static void main(String[] args) {

		Student e1 = new Student(100, "A");
		Student e2 = new Student(200, "B");
		Student e3 = new Student(300, "C");
		Student e4 = new Student(400, "D");

		HashMap<Integer, Student> hs = new HashMap<Integer, Student>();
		hs.put(1, e1);
		hs.put(2, e2);
		hs.put(3, e3);
		hs.put(4, e4);

		
		Set<Entry<Integer, Student>> s = hs.entrySet();
		for (Entry e : s) {
			System.out.println(e);

		}
	}

}
