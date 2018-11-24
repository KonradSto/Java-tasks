package pl.coderstrust.foobar;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FooBarTest {

    @Test
    public void shouldReturnFooBar() {
        // Given
        int size = 15;
        List<String> expected = Arrays.asList("0", "1", "2", "3Foo", "4", "5Bar", "6Foo", "7", "8", "9Foo", "10Bar", "11", "12Foo", "13", "14", "15FooBar");

        // When
        List<String> actual = FooBar.getFooBar(size);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestException() {
        // Given
        int size = -1;

        // When
        try {
            List<String> actual = FooBar.getFooBar(size);
            Assert.fail("Exception should be thrown!");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            assertEquals("Size cannot be lower than 0", anIllegalArgumentException.getMessage());
        }
    }
}
