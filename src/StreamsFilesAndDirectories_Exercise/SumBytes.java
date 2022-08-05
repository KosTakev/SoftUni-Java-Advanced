package StreamsFilesAndDirectories_Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        int value = bufferedReader.read();
        long sum = 0;

        while (value != -1) {
            char current = (char) value;
            if (current == 10 || current == 13) {
                value = bufferedReader.read();
                continue;
            } else {
                sum += current;
                value = bufferedReader.read();
            }
        }
        System.out.println(sum);


    }
}
