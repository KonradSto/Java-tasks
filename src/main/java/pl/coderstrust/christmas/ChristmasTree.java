package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        System.out.println(getChristmasTree(5));
    }

    public static List<String> getChristmasTree(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        if (size == 0) {
            return Collections.emptyList();
        }
        List<String> christmasTree = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        for (int i = 0; i < size; i++) {
            item.append(getSpaces(size - i));
            item.append(getAsterisks(2 * i + 1));
            christmasTree.add(item.toString());
            item.delete(0, item.length());
        }
        christmasTree.add(getTreeTrunk(size - 1));
        return christmasTree;
    }

    private static String getSpaces(int numberOfSpaces) {
        StringBuilder spacesBuilder = new StringBuilder();
        for (int j = 0; j <= numberOfSpaces; j++) {
            spacesBuilder.append(" ");
        }
        String spaces = spacesBuilder.toString();
        return spaces;
    }

    private static String getAsterisks(int numberOfAsterisks) {
        StringBuilder asterisksBuilder = new StringBuilder();
        for (int k = 0; k < numberOfAsterisks; k++) {
            asterisksBuilder.append("*");
        }
        String asterisks = asterisksBuilder.toString();
        return asterisks;
    }

    private static String getTreeTrunk(int heightOfTree) {
        StringBuilder trunkBuilder = new StringBuilder();
        for (int l = 0; l <= heightOfTree; l++) {
            trunkBuilder.append(" ");
        }
        trunkBuilder.append("**");
        String trunk = trunkBuilder.toString();
        return trunk;
    }
}
