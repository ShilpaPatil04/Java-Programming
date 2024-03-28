package com.gcd;

import java.util.Scanner;

public class GCDorHCF {
	
	public static int check(int n1, int n2) {
		int min = 0;
		if(n1 < n2) {
			min=n1;
		}else {
			min = n2;
		}
		for(int i= min; i>=1;i--) {
			if(n1% i==0 && n2 % i==0) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of n1:");
			int n1 = sc.nextInt();
			System.out.println("Enter the value of n2:");
			int n2 = sc.nextInt();

			System.out.println(check(n1, n2));
	}

}
