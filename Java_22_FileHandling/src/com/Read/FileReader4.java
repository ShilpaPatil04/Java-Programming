package com.Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Reading file without using loops
public class FileReader4 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\FileHandling\\CreateFile.txt");
		Scanner sc = new Scanner(file);

		// we just need to use \\Z as delimiter
		sc.useDelimiter("\\Z");

		System.out.println(sc.next());
	}

}
