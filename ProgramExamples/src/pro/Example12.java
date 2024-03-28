package pro;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		System.out.println("Chech greatest of two numbers using terbary operator");
		
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = (a>b ? a:b);
		
		System.out.println(max);

	}

}
