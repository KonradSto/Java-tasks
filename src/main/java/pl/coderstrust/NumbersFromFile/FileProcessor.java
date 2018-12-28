package pl.coderstrust.NumbersFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<String> lines = new ArrayList<>();
        while (input.hasNextLine()) {
            lines.add(input.nextLine());
        }
        return lines;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) {
        try {
            PrintWriter output = new PrintWriter(new File(resultFileName + ".txt"));
            output.println(resultLines);
            output.close();
        } catch (IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}
