package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        Set<Character> punctuations = Set.of(',', '.', '!', '?');
        int value = inputStream.read();
        while (value != -1) {
            char current = (char) value;
            if(!punctuations.contains(current)) {
                outputStream.write(current);
            }

            value = inputStream.read();
        }
        outputStream.close();
    }
}
