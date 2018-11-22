package pl.coderstrust.multiplication;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(5);
        printMultiplicationTable(9);
    }

    public static int[][] printMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
        return multiplicationTable;
    }
}
