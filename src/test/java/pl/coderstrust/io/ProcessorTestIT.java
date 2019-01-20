package pl.coderstrust.io;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProcessorTestIT {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    FileProcessor fileProcessor = new FileProcessor();
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    Processor processor = new Processor(numbersProcessor, fileProcessor);

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
        //given

        byte[] expected = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\io\\expected.txt"));

        //when
        byte[] actual = Files.readAllBytes(Paths.get("src\\test\\resources\\pl\\coderstrust\\io\\output.txt"));

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullArgumentInNumbersProcessor() {
        numbersProcessor = null;
        thrown.expectMessage("Number processor argument cannot be null");
        thrown.expect(IllegalArgumentException.class);
        new Processor(numbersProcessor, fileProcessor);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullArgumentInFileProcessor() {
        fileProcessor = null;
        thrown.expectMessage("File processor argument cannot be null");
        thrown.expect(IllegalArgumentException.class);
        new Processor(numbersProcessor, fileProcessor);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullInputFilePathArgument() throws FileNotFoundException {
        String inputFilePath = null;
        String outputFilePath = null;
        thrown.expectMessage("Input file path cannot be null");
        //thrown.expectMessage("Output file path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        processor.process(inputFilePath, "Random/Output?Path");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullOutputFilePathArgument() throws FileNotFoundException {
        String outputFilePath = null;
        thrown.expectMessage("Output file path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        processor.process("Random/Input/Path", outputFilePath);
    }
}
