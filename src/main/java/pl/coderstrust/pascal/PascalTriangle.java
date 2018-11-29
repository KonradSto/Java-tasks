package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.print(getPascalTriangle(5));
    }

    public static List<String> getPascalTriangle(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        List<String> pascalTriangle = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        for (int i = 0; i < number; i++) {
            int nodeValue = 1;
            for (int k = 0; k <= i; k++) {
                item.append(String.format("%s ", nodeValue));
                nodeValue = nodeValue * (i - k) / (k + 1);
            }
            pascalTriangle.add(item.toString());
            item.delete(0, item.length());
        }
        return pascalTriangle;
    }
}
