package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println(result);
    }
}
