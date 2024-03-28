package pro;

import java.util.Scanner;

class demo1{
	public static String isPrime(int n) {
		int count =0;
		for(int i =2; i<=n/2 ; i++) {
			if(n%i ==0) {
				count++;
			}
		}
		if(count==0) {
			return "prime";
		}else {
			return "not prime";
		}
	}
	
}

public class Example27 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		String res =demo1.isPrime(n);
		System.out.println(res);

	}

}
