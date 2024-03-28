package com.map;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RopeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		PriorityQueue<Integer> ropes =new PriorityQueue<Integer>();
		for(int i =0; i<n ;i++) {
			int length = sc.nextInt();
			ropes.add(length);
		}
		
		int totalCost = 0, sum;
		
		while (ropes.size()>1) {
			
		int r1 = ropes.poll();
		int r2 = ropes.poll();
		
        sum = r1 + r2;
        totalCost = totalCost + sum;
        ropes.add(sum);
	}
		System.out.println(totalCost);
	}
}
