package pl.coderstrust.christmas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChristmasTreeTest {

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
    public void shouldTestException() {
        // Given
        int size = -1;

        // When
        try {
            ChristmasTree.getChristmasTree(size);
            Assert.fail("Exception should be thrown!");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            assertEquals("Size cannot be lower than 0", anIllegalArgumentException.getMessage());
        }
    }
}
