package pl.coderstrust.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String filePath) throws FileNotFoundException {
        if (filePath == null){
            throw new IllegalArgumentException("File path cannot be null");
        }
        try (Scanner input = new Scanner(new File(filePath))) {
            List<String> lines = new ArrayList<>();
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
            return lines;
        }
    }

    public void writeLinesToFile(List<String> lines, String filePath) throws FileNotFoundException {
        if (lines == null){
            throw new IllegalArgumentException("Lines to write cannot be null");
        }
        if (filePath == null){
            throw new IllegalArgumentException("File path cannot be null");
        }
        try(PrintWriter output = new PrintWriter(new File(filePath))) {
            for (int i = 0;  i < lines.size(); i++){
                output.println(lines.get(i));
            }
        }
    }
}
