package pl.coderstrust.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) throws IOException {
        List<String> result = new ArrayList<>();
        Files.lines(Paths.get("D:\\Dev\\solutions-9-konrad\\src\\main\\resources\\lines.txt"))
                .filter(line -> line.matches("^[\\d\\s]+"))
                .map(line -> line.trim().split("\\s+"))
                .forEach(arrayOfNumbers -> {
                    long sumOfNumber = Arrays.stream(arrayOfNumbers)
                            .mapToLong(Long::parseLong)
                            .sum();
                    String line = Arrays.stream(arrayOfNumbers).map(String::trim).collect(Collectors.joining("+"));

                    result.add(line + "=" + sumOfNumber);
                });
        writeLinesToFile(result, "D:\\Dev\\solutions-9-konrad\\src\\main\\resources\\resultLines.txt");
    }

    public static void writeLinesToFile(List<String> resultLines, String resultFileName) throws FileNotFoundException {
        try (PrintWriter output = new PrintWriter(new File(resultFileName))) {
            for (int i = 0; i < resultLines.size(); i++) {
                output.println(resultLines.get(i));
            }
        }
    }
}
