package pl.coderstrust.NumbersFromFile;

import java.util.Scanner;

public class NumbersProcessor {
    public String processLine(String line) {
        if (!Linevalidator.isLineValid(line)) {
            return "";
        }
        Scanner scanner = new Scanner(line);
        StringBuilder numbers = new StringBuilder();
        int sum = 0;
        while (scanner.hasNextInt()) {
            int nextInt = scanner.nextInt();
            sum += nextInt;
            numbers.append(nextInt);
            if(scanner.hasNextInt()){
                numbers.append("+");
            }
        }
        scanner.close();
        numbers.append("=").append(sum);
        return numbers.toString();
    }

    private static boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
            return line.matches("^[\\d\\s]+");
    }
}
