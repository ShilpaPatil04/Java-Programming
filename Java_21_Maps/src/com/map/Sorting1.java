package com.map;

import java.util.Scanner;

public class Sorting1 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int goals[] = {772,740,491,767,402};
		System.out.println("\nBefore Sorting");
		for(int i=0; i<goals.length ; i++) {
        	System.out.print(goals[i]+" ");
		}
        for(int i =0; i< goals.length-1; i++) {
        	for(int j =i+1; j< goals.length; j++) {
        		if(goals[i] > goals[j]) {
        			int temp = goals[i];
        	         goals[i]= goals[j];
        	         goals[j] = temp;
        		}
        	}
        	
        }
        System.out.println("\nAfter Sorting");
        for(int i=0; i<goals.length ; i++) {
        	System.out.print(goals[i]+" ");
        }
	}

}
