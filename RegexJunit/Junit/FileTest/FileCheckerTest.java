package RegexJunit.Junit.FileTest;

// FileProcessorTest.java
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

class FileCheckerTest {
    FileChecker fp = new FileChecker();
    String filename = "testfile.txt";

    @Test void testWriteAndRead() throws IOException {
        fp.writeToFile(filename, "Hello World");
        assertEquals("Hello World", fp.readFromFile(filename));
    }

    @Test void testFileExistsAfterWrite() throws IOException {
        fp.writeToFile(filename, "Check existence");
        assertTrue(Files.exists(Paths.get(filename)));
    }

    @Test void testIOExceptionOnMissingFile() {
        assertThrows(IOException.class, () -> fp.readFromFile("missing.txt"));
    }

    @AfterEach void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(filename));
    }
}
