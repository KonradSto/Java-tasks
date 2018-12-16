package pl.coderstrust.sort;

import java.util.Random;

public class QuickSort implements SortingMethod {
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivot = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, pivot - 1);
            quickSort(array, pivot + 1, highIndex);
        }
    }

    private int partition(int[] array, int lowIndex, int highIndex) {
        swap(array, lowIndex, getPivot(lowIndex, highIndex));
        int border = lowIndex + 1;
        for (int i = border; i <= highIndex; i++) {
            if (array[i] < array[lowIndex]) {
                swap(array, i, border++);
            }
        }
        swap(array, lowIndex, border - 1);
        return border - 1;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int getPivot(int lowIndex, int highIndex) {
        Random r = new Random();
        return r.nextInt((highIndex - lowIndex) + 1) + lowIndex;
    }
}
