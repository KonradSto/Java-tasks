package pl.coderstrust.Figures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectAreaOfSquare() {
        // Given
        Square square = new Square(5);
        double expectedArea = 25;

        // When
        double actual = square.calculateArea();

        // Then
        assertEquals(expectedArea, actual, 0.001);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both sides must be greater than 0");
        new Square(-1);
    }
}
