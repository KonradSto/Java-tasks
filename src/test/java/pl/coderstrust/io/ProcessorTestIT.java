package pl.coderstrust.io;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProcessorTestIT {

    private static FileProcessor fileProcessor = new FileProcessor();
    private static NumbersProcessor numbersProcessor = new NumbersProcessor();
    private static Processor processor = new Processor(numbersProcessor, fileProcessor);

    @BeforeClass
    public static void createsOutputFileBeforeTest() throws FileNotFoundException {
        processor.process("src\\test\\resources\\pl\\coderstrust\\io\\input.txt", "src\\test\\resources\\pl\\coderstrust\\io\\output.txt");
    }

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
        //given
        byte [] expected = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\io\\expected.txt"));

        //when
        byte [] actual = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\io\\output.txt"));

        //then
        assertThat(actual,is(expected));
    }
}
