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
        createInitialArray(array, maximumNumber);
        removeMultiples(array, maximumNumber);
        return extractPrimeNumbers(array, maximumNumber);
    }

    private static void createInitialArray(int[] array, int arraySize) {
        for (int i = 2; i <= arraySize - 2; i++) {
            array[i] = i;
        }
    }

    private static void removeMultiples(int[] arrayToClean, int maximumNumber) {
        for (int i = 2; i < maximumNumber; i++) {
            for (int n = i + i; n < arrayToClean.length; n += i) {
                arrayToClean[n] = MARKER;
            }
        }
    }

    private static int[] extractPrimeNumbers(int[] sizeOfPrimeArray, int maximumNumber) {
        int primesCount = 0;
        for (int i = 0; i < maximumNumber - 2; i++) {
            if (sizeOfPrimeArray[i] != MARKER) {
                primesCount++;
            }
        }
        return primeNumbersResult(sizeOfPrimeArray, primesCount, maximumNumber);
    }

    private static int[] primeNumbersResult(int[] primeArray, int primesCount, int maximumNumber) {
        int[] result = new int[primesCount];
        int position = 0;
        for (int i = 0; i < maximumNumber - 2; i++) {
            if (primeArray[i] != MARKER) {
                result[position++] = primeArray[i];
            }
        }
        return result;
    }
}
