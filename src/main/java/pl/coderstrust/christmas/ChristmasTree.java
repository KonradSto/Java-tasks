package pl.coderstrust.christmas;

public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(8);
        printChristmasTree(15);
    }

    private static void printChristmasTree(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" ");
            }
            System.out.print("**");
        }
        System.out.println();
    }
}
