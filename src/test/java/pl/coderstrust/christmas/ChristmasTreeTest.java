package pl.coderstrust.christmas;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
    public void shouldReturnEmptyList() {
        // Given
        int size = 0;
        List<String> expected = Collections.emptyList();

        // When
        List<String> actual = ChristmasTree.getChristmasTree(size);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        int size = -1;
        thrown.expectMessage("Size cannot be lower than 0");
        thrown.expect(IllegalArgumentException.class);
        ChristmasTree.getChristmasTree(size);
    }
}
