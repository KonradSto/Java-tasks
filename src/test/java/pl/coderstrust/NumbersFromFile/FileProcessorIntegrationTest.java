package pl.coderstrust.NumbersFromFile;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.List;

import static org.junit.Assert.*;

public class FileProcessorIntegrationTest {

    FileProcessor fileProcessor = new FileProcessor();
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    Processor processor = new Processor(numbersProcessor, fileProcessor);

    @BeforeClass
            public void createsOutputFileBeforeTest() throws FileNotFoundException {
        processor.process("src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\input.txt", "src\\test\\resources\\pl\\coderstrust\\NumbersFromFile\\output.txt");
    }

    @Test
    public void shouldWriteCorrectOutputFile(){
        //when


        //given

        //then

    }
}