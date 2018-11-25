package pl.coderstrust.multiplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableTest {

    @Test
    public void checkIfReturnsMultiplicationTable2() {
        //given
        int size = 5;
        int[][] expected = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};

        //when
        int[][] array = MultiplicationTable.getMultiplicationTable(size);

        //then
        assertArrayEquals(expected, array);
    }

    @Test
    public void testExceptionMessage() {
        //given
        int size = -1;
        try {
            MultiplicationTable.getMultiplicationTable(size);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            assertEquals("Size cannot be lower than 0", anIllegalArgumentException.getMessage());
        }
    }
}