package pl.coderstrust.NumbersFromFile;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FileProcessorIntegrationTest {

    private static FileProcessor fileProcessor = new FileProcessor();
    private static NumbersProcessor numbersProcessor = new NumbersProcessor();
    private static Processor processor = new Processor(numbersProcessor, fileProcessor);

    @BeforeClass
    public static void createsOutputFileBeforeTest() throws FileNotFoundException {
        processor.process("src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\input.txt", "src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\output.txt");
    }

    @Test
    public void shouldWriteCorrectOutputFile() throws IOException {
        //given
        byte [] expected = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\expected.txt"));

        //when
        byte [] actual = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\output.txt"));

        //then
        assertThat(actual,is(expected));
    }
}
