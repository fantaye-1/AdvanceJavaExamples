package com.cognixia.jump.advancejava.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a text file line by line with a {@link BufferedReader}.
 */
public class ReadFile {

	/** Returns every line of the file at {@code path}, in order. */
	public static List<String> readLines(String path) throws IOException {
		List<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}
		return lines;
	}

	public static void main(String[] args) {
		String path = args.length > 0 ? args[0] : "resources/tea.txt";
		try {
			System.out.println(path);
			System.out.println("_____________");
			for (String line : readLines(path)) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("Could not read " + path + ": " + e.getMessage());
		}
	}

}
