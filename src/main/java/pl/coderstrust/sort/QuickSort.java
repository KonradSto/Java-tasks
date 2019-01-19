package pl.coderstrust.sort;

import java.util.Random;

public class QuickSort implements SortingMethod {
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highIndex);
        }
    }


    private int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = getPivot(array, lowIndex, highIndex);
        int i = lowIndex - 1;
        int j = highIndex + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i < j) swap(array, i, j);
            else return j;
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
