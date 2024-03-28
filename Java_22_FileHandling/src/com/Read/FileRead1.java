package com.Read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Reading file from FileReadr class 
public class FileRead1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\FileHandling\\CreateFile.txt";
		try {
			FileReader fr = new FileReader(path);
			int ch = fr.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fr.read();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
