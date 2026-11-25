# AdvanceJavaExamples

Small Java file-I/O exercises (from the Cognixia JUMP advanced Java module).

| Class | What it shows |
|---|---|
| `FilesExample` | `java.io.File`: check if a file exists, create it, print its path/name/last-modified time, create a directory |
| `ReadFile` | Read a text file line by line with `BufferedReader` (default: `resources/tea.txt`) |
| `ReadChar` | Read a file one character at a time, stopping at the first `K` (default: `resources/temp.txt`) |

Both readers use try-with-resources so files are always closed, and accept an
optional file path as the first argument.

## Requirements

- Java 17+
- Maven 3.8+

## Build and test

```bash
mvn verify
```

Tests (JUnit 5) live in `test/` and cover `ReadFile.readLines` and `ReadChar.readUntil`.
GitHub Actions runs the same build on every push and pull request.

## Run an example

Run from the project root so the `resources/` paths resolve:

```bash
mvn -q compile
java -cp target/classes com.cognixia.jump.advancejava.files.ReadFile
java -cp target/classes com.cognixia.jump.advancejava.files.ReadChar resources/temp.txt
java -cp target/classes com.cognixia.jump.advancejava.files.FilesExample
```

In Eclipse, open the project as before (sources are still in `src/`), or import it as a Maven project.
