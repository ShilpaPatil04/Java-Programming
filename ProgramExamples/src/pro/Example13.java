package pro;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		
		 int a =sc.nextInt();//10
		 System.out.print("b=");
		 int b =sc.nextInt();//20
		 int tem=0;
		 
		 tem = b;//20
		 b=a;//10
		 a = tem;
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		
	}

}
