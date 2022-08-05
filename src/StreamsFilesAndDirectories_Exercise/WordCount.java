package StreamsFilesAndDirectories_Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Path pathToWords = Path.of("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "words.txt");

        Map<String, Integer> countWords = new LinkedHashMap<>();
        List<String> allLineWords = Files.readAllLines(pathToWords);

        allLineWords.forEach(line -> Arrays.stream(line.split("\\s+")).
                forEach(word -> countWords.put(word, 0)));

        Path pathToText = Path.of("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "text.txt");
        List<String> textAllLines = Files.readAllLines(pathToText);

        for (String line : textAllLines) {
            String[] wordsLine = line.split("\\s+");
            Arrays.stream(wordsLine).forEach(word -> {
                if (countWords.containsKey(word)) {
                    int currentCount = countWords.get(word);
                    countWords.put(word, currentCount + 1);
                }
            });
        }

        countWords.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        PrintWriter writer = new PrintWriter("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources\\results.txt");
        countWords.entrySet().stream().
                forEach(entry -> {
                    writer.println(entry.getKey() + " - " + entry.getValue());
                });
        writer.close();
    }
}
