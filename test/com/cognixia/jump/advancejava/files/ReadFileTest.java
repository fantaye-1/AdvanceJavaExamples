package com.cognixia.jump.advancejava.files;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ReadFileTest {

	@TempDir
	Path tempDir;

	@Test
	void readsAllLinesInOrder() throws IOException {
		Path file = tempDir.resolve("tea.txt");
		Files.write(file, List.of("green tea", "chai", "mint"));

		assertEquals(List.of("green tea", "chai", "mint"), ReadFile.readLines(file.toString()));
	}

	@Test
	void emptyFileGivesNoLines() throws IOException {
		Path file = Files.createFile(tempDir.resolve("empty.txt"));
		assertTrue(ReadFile.readLines(file.toString()).isEmpty());
	}

	@Test
	void missingFileThrows() {
		String missing = tempDir.resolve("nope.txt").toString();
		assertThrows(FileNotFoundException.class, () -> ReadFile.readLines(missing));
	}

	@Test
	void bundledTeaListIsReadable() throws IOException {
		// tests run from the project root, same as the examples
		List<String> teas = ReadFile.readLines("resources/tea.txt");
		assertEquals("green tea", teas.get(0));
		assertEquals(12, teas.size());
	}
}
