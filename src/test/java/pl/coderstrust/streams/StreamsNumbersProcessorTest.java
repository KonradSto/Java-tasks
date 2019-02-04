package pl.coderstrust.streams;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StreamsNumbersProcessorTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void shouldProcessProvidedInputFileAndSaveTheResult() throws IOException {
    //given
    String inputFilePath = "src\\test\\resources\\streams\\lines.txt";
    String outputFilePath = "src\\test\\resources\\streams\\resultLines.txt";
    String expectedFilePath = "src\\test\\resources\\streams\\expected.txt";
    List<String> expected = Files.readAllLines(Paths.get(expectedFilePath));

    //when
    StreamsNumbersProcessor.process(inputFilePath, outputFilePath);
    List<String> actual = Files.readAllLines(Paths.get(outputFilePath));

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