package pro;

import java.util.Scanner;

public class ArrayOddNumReverse {
    
	static int Odd(int[] ar) {
		int sum =0;
		for(int i =0; i<ar.length;i++) {
			if(ar[i]% 2 !=0) {
				sum = sum+ ar[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();

		int[] ar = new int[size];
		
		for(int i=0; i< ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		 
		int res =Odd(ar);
		
		System.out.println(res);
		
	}

}
