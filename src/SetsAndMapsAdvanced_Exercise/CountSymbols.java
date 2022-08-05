package SetsAndMapsAdvanced_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> mapOfSymbols = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (mapOfSymbols.containsKey(currentSymbol)) {
                int currentCount = mapOfSymbols.get(currentSymbol);
                mapOfSymbols.put(currentSymbol, currentCount + 1);
            } else {
                mapOfSymbols.put(currentSymbol, 1);
            }
        }
        mapOfSymbols.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s"));
    }
}
