package StreamsFilesAndDirectories_Lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PathAndFiles {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt");

        List<String> lines = Files.readAllLines(path).
                stream().
                sorted().
                collect(Collectors.toList());

        Files.write(Paths.get("out-sorted.txt"), lines);
    }
}