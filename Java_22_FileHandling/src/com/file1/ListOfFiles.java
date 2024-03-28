package com.file1;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		//the list() method will gives how many files are present in a file
		String path = "C:\\FileHandling";
		File f = new File(path);
		String[] str =f.list();
		for(String s : str) {
			System.out.println(s);
		}
			

	}

}
