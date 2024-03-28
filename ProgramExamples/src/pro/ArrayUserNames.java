package pro;

import java.util.Scanner;

public class ArrayUserNames {

	static String PrintNames(String[] name) {
		 String s = null;
		for(int i=0; i< name.length; i++) {
		    s = name[i];
		   }
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		String[] name = new String[size];
		System.out.println();
		System.out.print("enter names:");
		
		for(int i=0; i< name.length; i++) {
			name[i] = sc.next();
		}

		
		PrintNames(name);
		for(int i=0; i< name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
