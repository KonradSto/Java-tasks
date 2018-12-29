package pl.coderstrust.NumbersFromFile;

public class LineValidator {
    public static boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
        return line.matches("^[\\d\\s]+");
    }
}
