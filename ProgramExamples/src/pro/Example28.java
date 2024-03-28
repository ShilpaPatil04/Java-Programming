package pro;

import java.util.Scanner;

class demo2{
	public static String isPrime(int n) {
		
		for(int i =2; i<=n/2 ; i++) {
			if(n%i ==0) {
				return "not prime";
			}
		}
		return "prime";
	}
	
}


public class Example28 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		String res =demo2.isPrime(n);
		System.out.println(res);

	}

}
