package StreamsFilesAndDirectories_Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String pathString = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\input.txt";
        Path path = Path.of(pathString);
        List<String> allLines = Files.readAllLines(path);

//        for (String allLine : allLines) {
//            int sum = 0;
//            for (int i = 0; i < allLine.length(); i++) {
//                char currentSymbol = allLine.charAt(i);
//                sum += currentSymbol;
//            }
//            System.out.println(sum);
//        }
        allLines.stream().
                map(String::toCharArray).
                forEach(charArray -> {
                    int sum = 0;
                    for (char symbol : charArray) {
                        sum += symbol;
                    }
                    System.out.println(sum );
                });
    }
}
