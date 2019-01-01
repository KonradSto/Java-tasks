package pl.coderstrust.Figures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TriangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectAreaOfSquare() {
        // Given
        Triangle triangle = new Triangle(5, 4);
        double expectedArea = 10;

        // When
        double actual = triangle.calculateArea();

        // Then
        assertEquals(expectedArea, actual, 0.001);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both base and height must be greater than 0");
        new Triangle(0, 4);
    }
}
