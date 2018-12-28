package pl.coderstrust.Figures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class RectangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectAreaOfSquare() {
        // Given
        Rectangle rectangle = new Rectangle(5, 8);
        double expectedArea = 40;

        // When
        double actual = rectangle.calculateArea();

        // Then
        assertEquals(expectedArea, actual, 0.001);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both sides must be greater than 0");
        new Rectangle(-1, 3);
    }
}