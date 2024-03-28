package com.continueStatement;

public class InsideInnerLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				if (j == 3 && i == 3) {
					continue;
				}
				System.out.println(i + "*" + j + "=" + (i * j));
			}

		}

	}

}
