package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private final static int MARKER = 0;

    public static void main(String[] args) {
        int[] result = sieve(20);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = createInitialArray(maximumNumber);
        removeMultiples(array, maximumNumber);
        return extractPrimeNumbers(array);
    }

    private static void createInitialArray(int[] array, int maximumNumber) {
        for (int i = 0; i < maximumNumber; i++) {
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

    private static int[] extractPrimeNumbers(int[] primeArray) {
        //getCountOfPrimeNumbers(primeArray);
        int[] result = new int[getCountOfPrimeNumbers(primeArray)];
        for (int i = 2, j = 0; i < primeArray.length; i++) {
            if (primeArray[i] != MARKER) {
                result[j++] = primeArray[i];
            }
        }
        return result;
    }

    private static int getCountOfPrimeNumbers(int[] array) {
        int primesCount = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != MARKER) {
                primesCount++;
            }
        }
        return primesCount;
    }
}
