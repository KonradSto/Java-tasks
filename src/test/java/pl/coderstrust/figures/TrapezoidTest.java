package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
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
    @Parameters({"-1, 4, 5", "4, 0, 5", "4, 3, -1"})
    public void shouldThrowExceptionForInvalidArgument(double bottomBase, double topBase, double height) {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Both bases and height must be greater than 0");
        new Trapezoid(bottomBase, topBase, height);
    }
}
