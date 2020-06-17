package com.cognixia.jump.advancejava.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadChar {

	public ReadChar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO buffer reader and writer exercices.
		
		File file  = new File("resources/temp.txt");
		
		FileReader fileReader = null;
		BufferedReader reader = null;
		
		try {
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			int charValue;
			
			while((charValue = reader.read() ) != -1) {
				char letter = (char) charValue;
				System.out.print("temp.txt");
				if(letter == 'K') {
					break;
				}
			}
			reader.skip(5L); // skips 5 charachters
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
