package pro;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operator +,-,*,/,%");
		char op = sc.next().trim().charAt(0);
		int ans = 0;
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		if(op == '+') {
			ans = a +b;
		}else if(op == '-') {
			ans = a -b;
		}else if(op == '*') {
			ans = a * b;
		}else if(op == '/') {
			ans = a /b;
		}else if (op == '%') {
			if(a >b) {
			ans = a % b;
			}else {
				System.out.println(0);
			}
		} 
		else if(op !='x' || op != 'X') {
			System.out.println("Progrm ends");
		}else {
			System.out.println("Invalid operator ");
		}
		System.out.println(ans);
		
	}
	

}
