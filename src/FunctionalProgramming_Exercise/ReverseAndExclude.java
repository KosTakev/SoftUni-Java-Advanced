package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> predicate = e -> e % n == 0;

        numbers.removeIf(predicate);

        numbers.forEach(num -> System.out.print(num + " "));

        
    }
}
