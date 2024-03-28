package pro;

import java.util.Scanner;

public class ArrayPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}

		for(int i =0; i< n.length; i++) {
			for(int j =i+1; j<n.length ; j++) {
			
			System.out.println(n[i]+","+n[j]);
		}
		}
	}

}
