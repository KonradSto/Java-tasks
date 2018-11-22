package pl.coderstrust.multiplication;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MultiplicationTableTest {

    @Test
    public void checkIfReturnsMultiplicationTable1() {
        //given
        int size = 3;
        int[][] expected = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};

        //when
        int[][] array = MultiplicationTable.printMultiplicationTable(size);

        //then
        assertArrayEquals(expected, array);
    }

    @Test
    public void checkIfReturnsMultiplicationTable2() {
        //given
        int size = 5;
        int[][] expected = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};

        //when
        int[][] array = MultiplicationTable.printMultiplicationTable(size);

        //then
        assertArrayEquals(expected, array);
    }
}