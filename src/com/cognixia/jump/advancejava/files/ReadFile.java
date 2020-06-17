package com.cognixia.jump.advancejava.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {	
	public static void filewriter() {
		
	}
	public static void main(String[] args) {
		// TODO read from stream
		
		File file = new File("resources/tea.txt");
		
		try(FileReader fileReader = new FileReader(file);
				BufferedReader reder = new BufferedReader(fileReader)){
			//read a singe line in a file
			System.out.println("tea.txt");
			System.out.println("_____________"); 
			
			String line;
			while((line= reder.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
