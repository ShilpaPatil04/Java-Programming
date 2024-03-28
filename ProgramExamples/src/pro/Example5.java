package pro;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("check whether number is ends with 7 or not:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		System.out.println("Removes the last digit, and the number is: "+n1/10);

	}

}
