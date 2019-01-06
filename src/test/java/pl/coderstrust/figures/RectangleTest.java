package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
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
    @Parameters({"-1, 4", "4, -1"})
    public void shouldThrowExceptionForInvalidArgument(double sideA, double sideB) {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Sides must be greater than 0");
        new Rectangle(sideA, sideB);
    }
}
