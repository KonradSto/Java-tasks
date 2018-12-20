package pl.coderstrust.NumbersFromFile;

import java.util.Scanner;

public class NumbersProcessor {
    public String processLine(String line) {
        if (!lineValidation(line)) {
            return "";
        }
        if (lineValidation(line)) {
            line = line.replaceAll("[^0-9]+", " ");
        }
        Scanner scan = new Scanner(line);
        StringBuilder builder = new StringBuilder();
        int result = 0;
        while (scan.hasNextInt()) {
            int nextInt = scan.nextInt();
            builder.append(nextInt).append("+");
            result += nextInt;
        }
        scan.close();
        builder.deleteCharAt(builder.length() - 1);
        builder.append("=").append(result);
        return builder.toString();
    }

    private boolean lineValidation(String line) {
        if (line.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
