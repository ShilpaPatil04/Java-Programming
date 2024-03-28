package com.exce;

import java.util.Scanner;

class ATM{
	int acc_no =1234;
	int passWord = 1234;
	int accc,psww;
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter acc no");
		int accc = sc.nextInt();
		System.out.println("Enter password");
		int psww = sc.nextInt();
		
		if (acc_no==accc &&  passWord ==psww ) {
			System.out.println("Collect ur money");
		}
		else {
			System.out.println("Put a valid info");
		}
	}
		

}

class Bank{
	void initiate() {
	ATM a = new ATM();
	a.acceptInput();
	//a.verify();
}
}


public class CustomExceptiom {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();

	}

}
