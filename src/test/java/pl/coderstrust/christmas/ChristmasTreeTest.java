package pl.coderstrust.christmas;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ChristmasTreeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnChristmasTree() {
        // Given
        int size = 4;
        List<String> expected = Arrays.asList("     *", "    ***", "   *****", "  *******", "    **");

        // When
        List<String> actual = ChristmasTree.getChristmasTree(size);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    @Parameters({"-1", "0",})
    public void shouldThrowExceptionForInvalidArgument(int size) {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Size cannot be lower than 0");
        ChristmasTree.getChristmasTree(size);
    }
}
