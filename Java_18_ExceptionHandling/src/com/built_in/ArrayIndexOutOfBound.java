package com.built_in;

import java.util.Arrays;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] ar = new int[4];
		ar[0] =1;
		ar[1] =2;
		ar[2] = 4;
		ar[3] = 3;
		
		try {
			ar[5] = 10;
		System.out.println(Arrays.toString(ar));
		}catch(ArrayIndexOutOfBoundsException aey) {
			System.out.println(aey.getMessage());
		}
	}

}
