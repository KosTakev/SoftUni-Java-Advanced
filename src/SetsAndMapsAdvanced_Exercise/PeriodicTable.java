package SetsAndMapsAdvanced_Exercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            //first way:
//            for (String el : input) {
//                elements.add(el);
//            }
            //second way:
//            Collections.addAll(elements, input);
            //third way:
            elements.addAll(Arrays.asList(input));
        }

        elements.forEach(e -> System.out.print(e + " "));
    }
}
