package pl.coderstrust.io;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FileProcessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private static FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullFilePathWhenReadingFromFile() throws FileNotFoundException {
        String filePath = null;
        thrown.expectMessage("File path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        fileProcessor.readLinesFromFile(filePath);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullLinesListToWrite() throws FileNotFoundException {
        List<String> lines = null;
        thrown.expectMessage("Lines to write cannot be null");
        thrown.expect(IllegalArgumentException.class);
        fileProcessor.writeLinesToFile(lines, "Random/File/Path");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullFilePathWhenWritingToFile() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        String filePath = null;
        thrown.expectMessage("File path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        fileProcessor.writeLinesToFile(lines, filePath);
    }
}
