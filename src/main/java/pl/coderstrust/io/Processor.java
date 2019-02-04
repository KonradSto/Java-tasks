package pl.coderstrust.io;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        if (numbersProcessor == null){
            throw new IllegalArgumentException("Number processor argument cannot be null");
        }
        this.fileProcessor = fileProcessor;
        if (fileProcessor == null){
            throw new IllegalArgumentException("File processor argument cannot be null");
        }
    }

    public void process(String inputFileName, String outputFileName) throws FileNotFoundException {
        if (inputFileName == null){
            throw new IllegalArgumentException("Input file path cannot be null");
        }
        if (outputFileName == null){
            throw new IllegalArgumentException("Output file path cannot be null");
        }
        List<String> linesFromFile = fileProcessor.readLinesFromFile(inputFileName);
        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            if (LineValidator.isLineValid(line)) {
                resultLines.add(numbersProcessor.processLine(line));
            }
        }
        fileProcessor.writeLinesToFile(resultLines, outputFileName);
    }
}
