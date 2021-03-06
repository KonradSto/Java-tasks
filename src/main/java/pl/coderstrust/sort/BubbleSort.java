package pl.coderstrust.sort;

public class BubbleSort implements SortingMethod {

    public int[] sort(int[] array) {
        int[] arrayToSort = array.clone();
        boolean isSwapped;
        for (int i = 0; i < arrayToSort.length; i++) {
            isSwapped = false;
            for (int j = 1; j < (arrayToSort.length) - i; j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    swapElementsInArray(arrayToSort, j - 1, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
        return arrayToSort;
    }

    private static void swapElementsInArray(int[] array, int indexOfFirstElement, int indexOfSecondElement) {
        int temp = array[indexOfFirstElement];
        array[indexOfFirstElement] = array[indexOfSecondElement];
        array[indexOfSecondElement] = temp;
    }
}
