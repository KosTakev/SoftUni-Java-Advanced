package StreamsFilesAndDirectories_Lab;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
       // Scanner scanner = new Scanner(System.in);

        String path = "D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        BufferedWriter writer = new BufferedWriter(new PrintWriter("out_third-line.txt"));

        String line = reader.readLine();
        int count = 1;

        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }
        // изпразваме буфера чрез ФЛЪШ:
        writer.flush();
    }
}
