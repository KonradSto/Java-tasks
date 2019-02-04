package pl.coderstrust.io;

import java.util.Scanner;

public class NumbersProcessor {
    public String processLine(String line) {
        if (!LineValidator.isLineValid(line)) {
            return "";
        }
        try(Scanner scanner = new Scanner(line)) {
            StringBuilder numbers = new StringBuilder();
            int sum = 0;
            while (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                sum += nextInt;
                numbers.append(nextInt);
                if (scanner.hasNextInt()) {
                    numbers.append("+");
                }
            }
            scanner.close();
            numbers.append("=").append(sum);
            return numbers.toString();
        }
    }
}
