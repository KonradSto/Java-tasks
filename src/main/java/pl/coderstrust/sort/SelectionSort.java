package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {8, 9, -1, -5, 0, 15};
        int[] sortedArray = sort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        int[] arrayToSort = array.clone();
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int minimumNumberIndex = getMinimumNumberIndex(arrayToSort, i);
            swapElementsInArray(arrayToSort, i, minimumNumberIndex);
        }
        return arrayToSort;
    }

    private static int getMinimumNumberIndex(int[] array, int i) {
        int minimumNumberIndex = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minimumNumberIndex]) {
                minimumNumberIndex = j;
            }
        }
        return minimumNumberIndex;
    }

    private static void swapElementsInArray(int[] array, int indexOfCurrentElement, int currentMinimumIndex) {
        int temp = array[indexOfCurrentElement];
        array[indexOfCurrentElement] = array[currentMinimumIndex];
        array[currentMinimumIndex] = temp;
    }
}
