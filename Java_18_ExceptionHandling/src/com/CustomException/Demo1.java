package com.CustomException;

import java.util.Scanner;

class InvalidUserException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid card details. Try again";
	}
}

class ATM {
	private int accNum = 1234;
	private int pin = 9999;
	private int an;
	private int psw;

	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account num:");
		an = sc.nextInt();
		System.out.println("Enter password:");
		psw = sc.nextInt();
	}



	public void validate() throws InvalidUserException {
		if (accNum == an && pin == psw) {
			System.out.println("Collect your money");
		} else {
			InvalidUserException i = new InvalidUserException();
			System.out.println(i.getMessage());
			throw i;
		}
	}
}

class Bank {
	public void initiate() {
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.validate();
		} catch (Exception e) {
			try {
				atm.acceptInput();
				atm.validate();
			} catch (Exception f) {
				try {
					atm.acceptInput();
					atm.validate();
				} catch (Exception g) {
					System.out.println("Card is blocked!!!");
				}
			}
		}
	}

}

public class Demo1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();

	}

}
