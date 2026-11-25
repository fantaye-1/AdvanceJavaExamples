package com.cognixia.jump.advancejava.files;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

class ReadCharTest {

	@Test
	void stopsAtStopCharacterInclusive() throws IOException {
		StringReader reader = new StringReader("abcKdef");
		assertEquals("abcK", ReadChar.readUntil(reader, 'K'));
		// the rest of the stream is left unread
		assertEquals('d', (char) reader.read());
	}

	@Test
	void readsWholeStreamWhenStopCharacterMissing() throws IOException {
		assertEquals("hello world", ReadChar.readUntil(new StringReader("hello world"), 'K'));
	}

	@Test
	void emptyStreamGivesEmptyString() throws IOException {
		assertEquals("", ReadChar.readUntil(new StringReader(""), 'K'));
	}
}
