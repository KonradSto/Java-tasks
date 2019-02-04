package pl.coderstrust.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort implements SortingMethod {

    public int[] sort(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        Collections.sort(list);
        int[] sortedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            sortedArray[i] = list.get(i);
        return sortedArray;
    }
}
