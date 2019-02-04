package pl.coderstrust.sort;

import java.util.Arrays;

public class MergeSort implements SortingMethod {
    public int[] sort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return array;
        }
        int mid = n / 2;
        int[] l = Arrays.copyOfRange(array,0,mid);
        int[] r = Arrays.copyOfRange(array,mid,n);

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        sort(l);
        sort(r);
        merge(array, l, r, mid, n - mid);
        return array;
    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }
}
