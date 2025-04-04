package com.bridgelabz;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private final String testFilename = "testfile.txt";
    private final String testContent = "Hello, File Handling!";

    @BeforeEach
    void setup() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(testFilename));
    }

    @Test
    public void shouldWriteAndReadContentCorrectly() throws IOException {
        fileProcessor.writeToFile(testFilename, testContent);
        String contentRead = fileProcessor.readFromFile(testFilename);
        assertEquals(testContent, contentRead);
    }

    @Test
    public void shouldCreateFileAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFilename, testContent);
        File file = new File(testFilename);
        assertTrue(file.exists());
    }

    @Test
    public void shouldThrowIOExceptionWhenFileDoNotExist() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("nonexistinfile.txt");
        });
    }
}
