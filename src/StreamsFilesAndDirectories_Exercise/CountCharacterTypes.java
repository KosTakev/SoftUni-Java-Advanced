package StreamsFilesAndDirectories_Exercise;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String pathStr = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\input.txt";
        FileReader fileReader = new FileReader(pathStr);
        FileWriter writer = new FileWriter("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //List<String> allLines = Files.readAllLines(Path.of(pathStr));

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        int value = fileReader.read();

        while (value != -1) {
            char current = (char) (value);

            if (current == 'a' || current == 'e' || current == 'o' ||
            current == 'u' || current == 'i') {
                vowelsCount ++;
            } else if (current == '.' || current == ',' || current == '?' ||
            current == '!') {
                punctuationCount++;
            } else if (current != 10 && current != 13 && current != 32) {
                consonantsCount++;
            } else {
                value = fileReader.read();
                continue;
            }
            value = fileReader.read();
        }
        bufferedWriter.write("Vowels: " + vowelsCount);
        bufferedWriter.newLine();
        bufferedWriter.write("Consonants: " + consonantsCount);
        bufferedWriter.newLine();
        bufferedWriter.write("Punctuation: " + punctuationCount);
        bufferedWriter.close();
    }
}
