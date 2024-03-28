package com.gcd;

import java.util.Scanner;

public class EuclidsGCD {

	public static int Gcd(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		int n1 = sc.nextInt();
		System.out.println("Enter the value of n2:");
		int n2 = sc.nextInt();
		
		System.out.println(Gcd(n1,n2));

	}

}
