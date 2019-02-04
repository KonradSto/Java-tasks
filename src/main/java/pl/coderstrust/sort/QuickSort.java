package pl.coderstrust.sort;

import java.util.Random;

public class QuickSort implements SortingMethod {
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int partitionIndex = partition(array, lowerIndex, higherIndex);
            quickSort(array, lowerIndex, partitionIndex);
            quickSort(array, partitionIndex + 1, higherIndex);
        }
    }

    private int partition(int[] array, int lowerIndex, int higherIndex) {
        int pivot = getPivot(array, lowerIndex, higherIndex);
        int i = lowerIndex - 1, j = higherIndex + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i < j) {
                swap(array, i, j);
            } else return j;
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int getPivot(int[] array, int lowIndex, int highIndex) {
        Random r = new Random();
        return array[r.nextInt((highIndex - lowIndex) + 1) + lowIndex];
    }
}
