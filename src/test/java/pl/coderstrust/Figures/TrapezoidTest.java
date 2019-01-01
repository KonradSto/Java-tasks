package pl.coderstrust.Figures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TrapezoidTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectAreaOfSquare() {
        // Given
        Trapezoid trapezoid = new Trapezoid(5, 3, 3);
        double expectedArea = 12;

        // When
        double actual = trapezoid.calculateArea();

        // Then
        assertEquals(expectedArea, actual, 0.001);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both bases and height must be greater than 0");
        new Trapezoid(1, 0, 9);
    }
}
