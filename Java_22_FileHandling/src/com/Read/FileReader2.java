package com.Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Reading file from Scanner class
public class FileReader2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\FileHandling\\CreateFile.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.print(sc.nextLine());
		}

	}

}
