package com.CustomException;

import java.util.Scanner;

class UnderAgeException extends Exception {
	public String getMessage(String msg) {
		return "You are too Young. Have some patience";
	}
}

class OverAgeException extends Exception {
	public String getMessage(String msg) {
		return "You are too old. Cool Down!!";
	}
}

class Applicant {
	private int age;

	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		age = sc.nextInt();
	}

	public void validate() throws OverAgeException, UnderAgeException {
		if (age >= 18 && age <= 68) {
			System.out.println("Collect your licence");
		} else if (age < 18) {
			UnderAgeException ue = new UnderAgeException();
			ue.getMessage();
			throw ue;
		} else {
			OverAgeException oe = new OverAgeException();
			oe.getMessage();
			throw oe;
		}
	}
}

class RTO {
	public void acceptApplicant() {
		Applicant a = new Applicant();
		try {
			a.acceptInput();
			a.validate();
		} catch (Exception e) {
			try {
				a.acceptInput();
				a.validate();
			} catch (Exception f) {
				System.out.println("Apply again in 15 days!!!");
			}
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		RTO r = new RTO();
		r.acceptApplicant();
	}

}
