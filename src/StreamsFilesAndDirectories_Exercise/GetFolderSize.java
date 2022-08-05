package StreamsFilesAndDirectories_Exercise;

import java.io.File;

public class GetFolderSize {

    public static void main(String[] args) {

        String pathStr = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(pathStr);
        File[] filesInFolder = folder.listFiles();
        int totalSize = 0;

        for (File file : filesInFolder) {
            totalSize += file.length();
        }

        System.out.println("Folder size: " + totalSize);
    }
}
