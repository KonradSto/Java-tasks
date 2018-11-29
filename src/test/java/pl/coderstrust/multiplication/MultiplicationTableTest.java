package pl.coderstrust.multiplication;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class MultiplicationTableTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectMultiplicationTable() {
        //given
        int size = 5;
        int[][] expected = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};

        //when
        int[][] array = MultiplicationTable.getMultiplicationTable(size);

        //then
        assertArrayEquals(expected, array);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        int size = -1;
        thrown.expectMessage("Size cannot be lower than 0");
        thrown.expect(IllegalArgumentException.class);
        MultiplicationTable.getMultiplicationTable(size);
    }
}
