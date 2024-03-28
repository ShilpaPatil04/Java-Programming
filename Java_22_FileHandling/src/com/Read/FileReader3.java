package com.Read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {

	public static void main(String[] args) throws IOException {
		 // File path is passed as parameter
		File f = new File("C:\\FileHandling\\CreateFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);

		// Declaring a string variable
		String st;
		// Condition holds true till
		// there is character in a string
		while ((st = rd.readLine()) != null)

			// Print the string
			System.out.println(st);

	}

}
