package com.a.comparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee e) {
		String s1 = this.name;
		String s2 = e.name;
		return s1.compareTo(s2);
	}

//	@Override
//	public int compareTo(Employee e) {
//		Integer i1 = this.id;
//		Integer i2 = e.id;
//		return i1.compareTo(i2);
//	}

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Shilpa");
		Employee e2 = new Employee(20, "Anup");
		Employee e3 = new Employee(10, "Rani");
		Employee e4 = new Employee(31, "Paddi");

		TreeSet<Employee> al = new TreeSet<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		for (Employee e : al) {
			System.out.println(e);
		}
	}

}
