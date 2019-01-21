package pl.coderstrust.ioStreams;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StreamsNumbersProcessorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws IOException {
        //given
        String inputFilePath = "D:\\Dev\\solutions-9-konrad\\src\\test\\resources\\pl.coderstrust.ioStreams\\lines.txt";
        String outputFilePath = "D:\\Dev\\solutions-9-konrad\\src\\test\\resources\\pl.coderstrust.ioStreams\\resultLines.txt";
        String expectedFilePath = "D:\\Dev\\solutions-9-konrad\\src\\test\\resources\\pl.coderstrust.ioStreams\\expected.txt";
        byte[] expected = Files.readAllBytes(Paths.get(expectedFilePath));

        //when
        StreamsNumbersProcessor.process(inputFilePath, outputFilePath);
        byte[] actual = Files.readAllBytes(Paths.get(outputFilePath));

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullInputFilePath() throws IOException {
        String inputFilePath = null;
        thrown.expectMessage("Input file path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        StreamsNumbersProcessor.process(inputFilePath, "Random/Output/Path");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullOutputFilePath() throws IOException {
        String outputFilePath = null;
        thrown.expectMessage("Output file path cannot be null");
        thrown.expect(IllegalArgumentException.class);
        StreamsNumbersProcessor.process("Random/Input/Path", outputFilePath);
    }
}
