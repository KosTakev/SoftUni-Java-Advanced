package StreamsFilesAndDirectories_Exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path firstFilePath = Path.of("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources" +
                "\\inputOne.txt");
        List<String> allLinesFirstFile = Files.readAllLines(firstFilePath);

        Path secondFilePath = Path.of("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources" +
                "\\inputTwo.txt");
        List<String> allLinesSecondFile = Files.readAllLines(secondFilePath);

        PrintWriter writer = new PrintWriter("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "Exercises Resources\\" +
                "mergedFile.txt");

        allLinesFirstFile.forEach(line -> writer.println(line));
        allLinesSecondFile.forEach(line -> writer.println(line));

        writer.close();


    }
}
