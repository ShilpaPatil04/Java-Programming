package pro;

import java.util.Scanner;

public class ArrayOddReverse {
	
	static void reverse(int[] n) {
		for(int i = n.length-1 ; i >= 0 ;i--) {
			if(n[i]%2 != 0) {
				System.out.print(n[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		for(int i=0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
	 reverse(n);
	}

}
