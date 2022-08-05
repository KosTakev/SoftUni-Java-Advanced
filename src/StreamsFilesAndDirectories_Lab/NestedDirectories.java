package StreamsFilesAndDirectories_Lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedDirectories {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams");

        File root = path.toFile();
//        DFS:
        dfs(root);
//          BFS:
//        Deque<File> queue = new ArrayDeque<>();
//
//        //okazvam, otkyde trygva s "offer" metoda:
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            File currentFile = queue.poll();
//            System.out.println(currentFile.getName());
//            File[] files = currentFile.listFiles();
//
//            if (files != null) {
//                for (File file : files) {
//                    if(file.isDirectory()) {
//                        queue.offer(file);
//                    } else {
//                        System.out.println(file.getName());
//                    }
//                }
//            }
//        }
    }

    private static void dfs(File file) {
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    dfs(f);
                } else {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
