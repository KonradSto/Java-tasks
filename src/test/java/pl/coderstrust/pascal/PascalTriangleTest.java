package pl.coderstrust.pascal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnChristmasTree() {
        // Given
        int num = 5;
        List<String> expected = Arrays.asList("             1", "           1   1", "         1   2   1", "       1   3   3   1", "     1   4   6   4   1");

        // When
        List<String> actual = PascalTriangle.getPascalTriangle(num);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        int num = -1;
        thrown.expectMessage("Size cannot be lower than 0");
        thrown.expect(IllegalArgumentException.class);
        PascalTriangle.getPascalTriangle(num);
    }
}
