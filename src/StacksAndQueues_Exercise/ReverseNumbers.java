package StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        String[] arrayInput = input.split("\\s+");
        for (String s : arrayInput) {
            stack.push(Integer.parseInt(s));
        }
        while (stack.size() >= 1) {
            System.out.printf("%d ", stack.pop());
        }
    }
}
