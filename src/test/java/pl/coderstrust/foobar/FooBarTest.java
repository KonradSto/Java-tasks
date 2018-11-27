package pl.coderstrust.foobar;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FooBarTest {

    @Test
    public void shouldReturnCorrectFooBar() {
        // Given
        int size = 15;
        List<String> expected = Arrays.asList("0FooBar", "1", "2", "3Foo", "4", "5Bar", "6Foo", "7", "8", "9Foo", "10Bar", "11", "12Foo", "13", "14", "15FooBar");

        // When
        List<String> actual = FooBar.getFooBar(size);

        // Then
        assertEquals(expected, actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionForInvalidArgument() throws IllegalArgumentException {
        int size = -1;
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Size cannot be lower than 0");
        FooBar.getFooBar(size);
    }
}
