package pl.coderstrust.ioStreams;

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

public class StreamsNumbersProcessor {
    public static void process(String inputFilePath, String outputFilePath) throws IOException {
        if (inputFilePath == null){
            throw new IllegalArgumentException("Input file path cannot be null");
        }
        if (outputFilePath == null){
            throw new IllegalArgumentException("Output file path cannot be null");
        }
        List<String> lines = new ArrayList<>();
        Files.lines(Paths.get(inputFilePath))
                .filter(line -> line.matches("^[\\d\\s]+"))
                .map(line -> line.trim().split("\\s+"))
                .forEach(arrayOfNumbers -> {
                    long sumOfNumber = Arrays.stream(arrayOfNumbers)
                            .mapToLong(Long::parseLong)
                            .sum();
                    String line = Arrays.stream(arrayOfNumbers).map(String::trim)
                            .collect(Collectors.joining("+"));

                    lines.add(line + "=" + sumOfNumber);
                });
        writesLinesToFile(lines, outputFilePath);
    }

    private static void writesLinesToFile(List<String> resultLines, String outputFileName) throws FileNotFoundException {
        try (PrintWriter output = new PrintWriter(new File(outputFileName))) {
            for (int i = 0; i < resultLines.size(); i++) {
                output.println(resultLines.get(i));
            }
        }
    }
}
