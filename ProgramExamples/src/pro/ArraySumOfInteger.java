package pro;

import java.util.Scanner;

public class ArraySumOfInteger {
	
	static int SumNum(int[] n) {
		int sum =0;
		for(int i =0; i< n.length-1 ; i++) {
			sum = sum + n[i];
	    }
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		
		int[] n = new int[size];
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}
		
		int res =SumNum(n);
		System.out.print(res/ n.length);

	}

}
