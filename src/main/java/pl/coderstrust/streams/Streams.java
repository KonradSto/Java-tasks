package pl.coderstrust.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.lines(Paths.get("D:\\Dev\\solutions-9-konrad\\src\\main\\resources\\lines.txt"))
                .filter(line -> line.matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println(lines);
    }
}
