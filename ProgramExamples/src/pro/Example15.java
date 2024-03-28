package pro;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n ; i++) {
			System.out.println(i*2);
		}
	}

}
