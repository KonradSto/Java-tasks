package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public abstract class SortingTestBase {
    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortRandomArrayOf10000Elements() {
        // given
        int[] given = new int[10000];
        Random r = new Random();
        for (int i = 0; i < given.length; i++) {
            given[i] = r.nextInt();
        }

        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertTrue(isSorted(result));
    }

    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    @Parameters(method = "simpleArrayParameters")
    public void shouldSortSimpleArray(int[] given, int [] expected) {
        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected,result);
    }

    public Object simpleArrayParameters(){

        int[]given1 = {};
        int[]expected1 = {};
        Object[] pair1 = {given1, expected1};

        int[]given2 = {0};
        int[]expected2 = {0};
        Object[] pair2 = {given2, expected2};

        int[]given3 = {0, 0, 0, 0};
        int[]expected3 = {0, 0, 0, 0};
        Object[] pair3 = {given3, expected3};

        int[]given4 = {1, 2, 3, 4};
        int[]expected4 = {1, 2, 3, 4};
        Object[] pair4 = {given4, expected4};

        int[]given5 = {1, 3, 2, 4};
        int[]expected5 = {1, 2, 3, 4};
        Object[] pair5 = {given5, expected5};

        return new Object[]{pair1, pair2, pair3, pair4, pair5};
    }
}
