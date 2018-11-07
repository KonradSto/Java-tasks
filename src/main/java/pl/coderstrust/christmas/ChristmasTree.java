package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(8);
        printChristmasTree(15);
    }

    public static void printChristmasTree(int size) {
        for (int i = 0; i < size; i++) {

            printSpaces(size - i);

            printAsterisks(2 * i + 1);
        }
        printTreeTrunk(size - 1);
    }

    private static void printSpaces(int numberOfSpaces) {
        for (int j = 0; j <= numberOfSpaces; j++) {
            System.out.print(" ");
        }
    }

    private static void printAsterisks(int numberOfAsterisks) {
        for (int k = 0; k < numberOfAsterisks; k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printTreeTrunk(int heightOfTree) {
        for (int l = 0; l <= heightOfTree; l++) {
            System.out.print(" ");
        }
        System.out.print("**");
        System.out.println();
    }
}
