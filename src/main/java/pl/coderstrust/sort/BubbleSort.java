package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] originalArray = {8, 6, -7, -14, 99, 0, 15};
        int[] sortedArray = sort(originalArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length) - i; j++) {
                if (array[j - 1] > array[j]) {
                    swapElementsInArray(array, j - 1, j);
                }
            }
        }
        return array;
    }

    private static void swapElementsInArray(int[] array, int indexOfFirstElement, int indexOfSecondElement) {
        int temp = array[indexOfFirstElement];
        array[indexOfFirstElement] = array[indexOfSecondElement];
        array[indexOfSecondElement] = temp;
    }
}
