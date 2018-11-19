package pl.coderstrust.multiplication;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(5);
        printMultiplicationTable(9);
        printMultiplicationTable(12);
    }

    public static void printMultiplicationTable(int size) {
        System.out.print("      ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%6d", i);
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.printf("%6d", result);
            }
            System.out.println();
        }
    }
}