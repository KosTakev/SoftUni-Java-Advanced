package StreamsFilesAndDirectories_Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\outputLineNumbers.txt");

        int lineCounter = 1;

        for (String line : allLines) {
            writer.println(lineCounter + ". " + line);
            lineCounter++;
        }
        writer.close();
    }
}
