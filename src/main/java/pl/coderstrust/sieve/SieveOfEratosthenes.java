package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private final static int MARKER = 0;

    public static void main(String[] args) {
        int[] result = sieve(100);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = new int[maximumNumber];
        for (int i = 0; i <= maximumNumber - 2; i++) {
            array[i] = i;
        }
        for (int i = 2; i < maximumNumber; i++) {
            // removeMultiplies(array, i)
            for (int n = i + i; n < array.length; n += i) {
                array[n] = 0;
            }
            // private static void removeMultiplies(int[] arrayToClean, int number)
        }
        int primesCount = 0;
        for (int i = 0; i < maximumNumber - 2; i++) {
            if (array[i] != 0) {
                primesCount++;
            }
        }
        int[] result = new int[primesCount];
        int position = 0;
        for (int i = 0; i < maximumNumber - 2; i++) {
            if (array[i] != 0) {
                result[position++] = array[i];
            }
        }
        return result;
    }
}

