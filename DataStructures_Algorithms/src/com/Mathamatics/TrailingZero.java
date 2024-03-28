package com.Mathamatics;

import java.util.Scanner;

public class TrailingZero {
	
	public static int CountZero(int n) {
		int res =0;
		int powerOf5 =5;
		while(n >=powerOf5) {
			res = res + (n/powerOf5);
			powerOf5 = powerOf5 * 5;
		}
		return res;
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of n:");
			int n = sc.nextInt();
			System.out.println("No of trailing zeros in "+ n + " are: "+CountZero(n));

	}

}
