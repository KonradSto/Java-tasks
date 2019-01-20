package pl.coderstrust.io;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters({"1 2 3, 1+2+3=6", "3 2 1, 3+2+1=6", "one 2 three, ", "12+3, "})
    public void shouldReturnSumOfNumbersForProvidedLine(String line, String expected){
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        //when
        String actual = numbersProcessor.processLine(line);

        //then
        assertThat(actual, is(expected));
    }
}
