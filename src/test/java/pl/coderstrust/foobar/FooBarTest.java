package pl.coderstrust.foobar;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FooBarTest {

    @Test
    public void shouldReturnFooBar() {
        // Given
        int size = 2;
        List<String> expected = Arrays.asList("0FooBar", "1", "2");


        // When
        List<String> actual = FooBar.getFooBar(size);

        // Then

        Assert.assertEquals(expected, actual);
    }

}