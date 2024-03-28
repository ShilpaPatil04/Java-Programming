package pro;

import java.util.Scanner;

class printFactor {
	public int factor(int n) {
		
		for(int i=1; i<=n ; i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
		}
		return n;
	}
}

public class Example23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		printFactor p = new printFactor();
		p.factor(n);

	}

}
