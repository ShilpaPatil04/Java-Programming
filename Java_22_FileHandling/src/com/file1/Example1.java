package com.file1;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		String path = "C:\\FileHandling\\Flhand1";
		File f = new File(path);
		//we can read a file
		System.out.println(f.canRead());
		//we can execute a file
		System.out.println(f.canExecute());
		//we can write a file
		System.out.println(f.canWrite());
		//we are checking file exist or not
		System.out.println(f.exists());
		
		System.out.println(f);
		
		System.out.println(f.getName());
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.getParent());
		
		System.out.println(f.getFreeSpace());
		
		System.out.println(f.getTotalSpace());
		
		System.out.println(f.getParentFile());
		
		System.out.println(f.delete());
		
		System.out.println(f.isFile());
		
		System.out.println(f.exists());

	}

}
