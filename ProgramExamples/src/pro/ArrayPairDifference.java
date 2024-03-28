package pro;

import java.util.Scanner;

public class ArrayPairDifference {
	
	static void printDiff(int[] n, int k) {
		
		for(int i =0; i< n.length-1 ; i++) {
			for(int j =0; i< n.length ; i++) {
				if((n[i] - n[j]) == k || (n[j] - n[i] == k)) {
					System.out.println(n[i]+","+n[j]);
				}
			}
		}
		
	} 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		System.out.println("Enter k value:");
		int k = sc.nextInt();
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}

		printDiff(n,k);
		
	}
}
