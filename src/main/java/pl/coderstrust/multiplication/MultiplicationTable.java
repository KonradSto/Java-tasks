package pl.coderstrust.multiplication;

public class MultiplicationTable {
    public static void main(String[] args) {
    }

    public static int[][] getMultiplicationTable(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        int[][] multiplicationTable = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
        return multiplicationTable;
    }
}
