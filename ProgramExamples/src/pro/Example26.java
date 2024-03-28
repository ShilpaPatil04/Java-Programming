package pro;


import java.util.Scanner;
class demo{
	public static String isPrime(int n) {
		int count =0;
		for(int i =1; i<=n ; i++) {
			if(n%i ==0) {
				count++;
			}
		}
		if(count==2) {
			return "prime";
		}else {
			return "not prime";
		}
	}
	
}



public class Example26 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		String res =demo.isPrime(n);
		System.out.println(res);
		
	}

}
