package pro;

import java.util.Scanner;

public class ArrayDivisible3_5 {
	static void array(int[] n) {
	for(int i =0; i< n.length ; i++) {
		if(n[i] % 3 == 0 && n[i] % 5 == 0) {
			System.out.print(n[i] + " ");
		}	
     }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
        int[] n = new int[size];
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}
	    array(n);
	}

}
