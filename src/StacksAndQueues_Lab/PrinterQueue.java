package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserQueue = new ArrayDeque<>();
        String fileName = scanner.nextLine();

        while (!fileName.equals("print")) {

            if (fileName.equals("cancel")) {
                String canceledFile = browserQueue.poll();
                if (canceledFile == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + canceledFile);
                }
            } else {
                browserQueue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }
    }
}
