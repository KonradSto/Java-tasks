package pl.coderstrust.NumbersFromFile;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NumbersProcessorTest {

    private static NumbersProcessor numbersProcessor = new NumbersProcessor();

    @Test
    public void shouldReturnProcessedLine(){
        //given
        String line = "one 1  two 2  three 3";
        String expected = "1+2+3=6";

        //when
        String actual = numbersProcessor.processLine(line);

        //then
        assertThat(actual, is(expected));
    }
}
