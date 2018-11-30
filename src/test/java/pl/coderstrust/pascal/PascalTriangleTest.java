package pl.coderstrust.pascal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectPascalTriangle() {
        // Given
        int number = 5;
        List<String> expected = Arrays.asList("1 ", "1 1 ", "1 2 1 ", "1 3 3 1 ", "1 4 6 4 1 ");

        // When
        List<String> actual = PascalTriangle.getPascalTriangle(number);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArray() {
        // Given
        int number = 0;
        List<String> expected = Collections.emptyList();

        // When
        List<String> actual = PascalTriangle.getPascalTriangle(number);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        int number = -1;
        thrown.expectMessage("Size cannot be lower than 0");
        thrown.expect(IllegalArgumentException.class);
        PascalTriangle.getPascalTriangle(number);
    }
}
