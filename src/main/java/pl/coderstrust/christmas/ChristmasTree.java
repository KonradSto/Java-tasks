package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
    }

    public static List<String> getChristmasTree(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        List<String> christmasTree = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        for (int i = 0; i < size; i++) {
            item.append(addSpaces(size - i));
            item.append(addAsterisks(2 * i + 1));
            christmasTree.add(item.toString());
            item.delete(0, item.length());
        }
        christmasTree.add(addTreeTrunk(size - 1));
        return christmasTree;
    }

    private static String addSpaces(int numberOfSpaces) {
        String spaces = "";
        for (int j = 0; j <= numberOfSpaces; j++) {
            spaces += " ";
        }
        return spaces;
    }

    private static String addAsterisks(int numberOfAsterisks) {
        String asterisks = "";
        for (int k = 0; k < numberOfAsterisks; k++) {
            asterisks += "*";
        }
        return asterisks;
    }

    private static String addTreeTrunk(int heightOfTree) {
        String trunk = "";
        for (int l = 0; l <= heightOfTree; l++) {
            trunk += " ";
        }
        trunk += "**";
        return trunk;
    }
}
