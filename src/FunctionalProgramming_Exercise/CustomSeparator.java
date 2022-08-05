package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Когато Comparator-а сравнява една двойка (последователни) числа връща:
        // ако първото е равно на второто - връща 0
        // ако първото е по-голямо от второто - връща 1
        // ако първото е по-малко от второто - връща -1

        // sorted (0) - не разменя двата елемента
        // sorted (1) - разменя елементите
        // sorted (-1) - не разменя елементите

        Comparator<Integer> comparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo(second);
            }
        });
        numbers.stream().sorted(comparator).forEach(n -> System.out.print(n + " "));

    }
}
