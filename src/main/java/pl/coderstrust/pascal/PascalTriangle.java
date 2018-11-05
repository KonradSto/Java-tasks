package pl.coderstrust.pascal;

public class PascalTriangle {
    public static void main(String[] args) {
        printPascalTriangle(8);
        printPascalTriangle(12);
    }

    private static void printPascalTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("   ");
            }
            int value = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%6d", value);
                value = value * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
