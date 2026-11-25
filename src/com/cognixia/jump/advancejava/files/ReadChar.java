package com.cognixia.jump.advancejava.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Reads a file one character at a time with a {@link BufferedReader},
 * stopping at the first 'K'.
 */
public class ReadChar {

	static final char STOP_CHAR = 'K';

	/**
	 * Reads characters from {@code reader} until {@code stop} is found
	 * (inclusive) or the end of the stream is reached.
	 */
	public static String readUntil(Reader reader, char stop) throws IOException {
		StringBuilder text = new StringBuilder();
		int charValue;
		while ((charValue = reader.read()) != -1) {
			char letter = (char) charValue;
			text.append(letter);
			if (letter == stop) {
				break;
			}
		}
		return text.toString();
	}

	public static void main(String[] args) {
		String path = args.length > 0 ? args[0] : "resources/temp.txt";

		// try-with-resources closes the reader even when reading fails,
		// and avoids the NullPointerException the old finally block threw
		// when the file did not exist.
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			System.out.print(readUntil(reader, STOP_CHAR));
			System.out.println();
		} catch (IOException e) {
			System.err.println("Could not read " + path + ": " + e.getMessage());
		}
	}

}
