package pl.coderstrust.figures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CircleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectAreaOfSquare() {
        // Given
        Circle circle = new Circle(6);
        double expectedArea = 113.097;

        // When
        double actual = circle.calculateArea();

        // Then
        assertEquals(expectedArea, actual, 0.001);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Radius must be greater than 0");
        new Circle(0);
    }
}
