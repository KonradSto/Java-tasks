package pl.coderstrust.Figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
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
    @Parameters({"-1, 4","4, -1"})
    public void shouldThrowExceptionForInvalidArgument(double base, double height) {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both base and height must be greater than 0");
        new Triangle(base, height);
    }
}
