package com.cognixia.jump.advancejava.files;

import java.io.File;
import java.io.IOException;

public class FilesExample {

	public FilesExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("resources/temp.txt");
		System.out.println("Does file exist? " + file.exists());
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File was created");
		}
		
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("File name: "+ file.getName());
		System.out.println("Last modified: " + file.lastModified());
		
		
		File dir = new File("resources/temp");
		
		boolean created = dir.mkdir();
		
		if(created) {
			System.out.println("dirctory is created");
		}else {
			System.out.println("directory is not created");
		}
		//....
		
		
		//File withDir = new File("resources/dir1/newFile.txt");
		
		//bufferReader and writer.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
