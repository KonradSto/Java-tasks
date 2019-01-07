package pl.coderstrust.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String filePath) throws FileNotFoundException {
        try (Scanner input = new Scanner(new File(filePath))) {
            List<String> lines = new ArrayList<>();
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
            return lines;
        }
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) throws FileNotFoundException {
        try(PrintWriter output = new PrintWriter(new File(resultFileName))) {
            for (int i = 0;  i < resultLines.size(); i++){
                output.println(resultLines.get(i));
            }
        }
    }
}
