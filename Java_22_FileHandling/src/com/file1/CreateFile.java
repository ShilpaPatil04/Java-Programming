package com.file1;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
//		String path = "C:\\FileHandling\\CreateFile";
//		File f = new File(path);
//		//here the file is created
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//here I'm checking is the file exist or not
//		System.out.println(f.exists());
//		System.out.println(f.mkdir());
		
		String path = "C:\\FileHandling\\CreateFile.txt";
		File f = new File(path);
		//here the file is created
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
        
	}

}
