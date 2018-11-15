package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {8, 9, -1, -5, 0};
        int[] sortedArray = sort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        int[] arrayToSort = array.clone();
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int minimum = arrayToSort[i];
            int temp;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < minimum) {
                    temp = minimum;
                    minimum = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
                arrayToSort[i] = minimum;
            }
        }
        return arrayToSort;
    }

   /* private static void swapElementsInArray(int[] array, int currentMinimum, int indexOfCurrentElement) {
        int temp = currentMinimum;
        currentMinimum = array[indexOfCurrentElement];
        array[indexOfCurrentElement] = temp;
    }*/
}
