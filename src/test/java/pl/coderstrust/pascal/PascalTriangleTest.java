package pl.coderstrust.pascal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

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
    public void shouldTestException() {
        // Given
        int num = -1;

        // When
        try {
            PascalTriangle.getPascalTriangle(num);
            Assert.fail("Exception should be thrown!");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            assertEquals("Size cannot be lower than 0", anIllegalArgumentException.getMessage());
        }
    }
}
