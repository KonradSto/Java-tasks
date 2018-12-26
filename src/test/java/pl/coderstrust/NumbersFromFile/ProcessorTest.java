package pl.coderstrust.NumbersFromFile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)

public class ProcessorTest {

    @Mock
    NumbersProcessor numbersProcessor;

    @Mock
    FileProcessor fileProcessor;

    @InjectMocks
    Processor processor;

    @Test
    public void shouldProcessProvidedInputFileAndSaveResultToProvidedOutputFile() throws FileNotFoundException {
        // given
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        when(fileProcessor.readLinesFromFile(inputFile)).thenReturn(Arrays.asList("1 2 3", "4 5 6"));
        //when(numbersProcessor.processLine("1 2 3")).thenReturn("1+2+3=6");

        // when
        processor.process(inputFile, outputFile);

        // then

        verify(fileProcessor).readLinesFromFile(inputFile);
        verify(numbersProcessor).processLine("1 2 3");
        verify(numbersProcessor).processLine("4 5 6");
        verify(fileProcessor).writeLinesToFile(any(), eq(outputFile));
    }
}
