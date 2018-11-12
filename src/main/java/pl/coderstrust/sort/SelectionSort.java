package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {8, 9, -1, -5, 0};
        System.out.println(Arrays.toString(sort(unsortedArray)));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimum = array[i];
            int temp;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimum) {
                    temp = minimum;
                    minimum = array[j];
                    array[j] = temp;
                }
                array[i] = minimum;
            }
        }
        return array;
    }
}
