package RegexJunit.Junit.FileTest;

// FileProcessor.java
import java.io.*;
import java.nio.file.*;

public class FileChecker {
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    public String readFromFile(String filename) throws IOException {
        return Files.readString(Paths.get(filename));
    }
}
