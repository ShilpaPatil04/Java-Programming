package pro;

import java.util.Scanner;



class avc{
	static boolean isPrime(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}



static void printNum(int n) {
	int count =0;
	for(int i =2; count <= n;i++) {
		if(isPrime(i)) {
			System.out.println(i);
			count++;
		}
	}
}



public class FirstPrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		printNum(n);

	}

}}

