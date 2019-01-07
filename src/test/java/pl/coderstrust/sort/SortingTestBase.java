package pl.coderstrust.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

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
    @Parameters()
    public void shouldSortSimpleArray(int[] given) {
        // when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        // then
        assertTrue(isSorted(result));
    }
}
