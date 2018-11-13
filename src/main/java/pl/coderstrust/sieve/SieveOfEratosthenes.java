package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(100)));

    }

    public static int[] sieve(int maximumNumber) {
        int[] array = new int[maximumNumber];
        for (int i = 0; i <= maximumNumber - 2; i++) {
            array[i] = i + 2;
        }
        for (int i = 0; i < maximumNumber; i++) {
            for (int n = 2; n <= maximumNumber; n++) {
                if (array[i] % n == 0 && array[i] != n) {
                    array[i] = 0;
                }
            }
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

