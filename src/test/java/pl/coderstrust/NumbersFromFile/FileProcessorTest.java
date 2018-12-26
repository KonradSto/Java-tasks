package pl.coderstrust.NumbersFromFile;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FileProcessorTest {

    @Test
    public void shouldReadLinesFromFile() throws FileNotFoundException {

        //given
        List<String> expected = new ArrayList<>();
        expected.add("this");
        expected.add("is");
        expected.add("simple");
        expected.add("input");
        expected.add("file");

        //when
        List<String> actual = FileProcessor.readLinesFromFile("src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\input_simple.txt");

        //then
        assertThat(actual, is(expected));

    }
}
