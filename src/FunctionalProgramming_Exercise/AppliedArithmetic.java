package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], int[]> add = e -> Arrays.stream(e).map(n -> n += 1).toArray();
        Function<int[], int[]> multiply = e -> Arrays.stream(e).map(n -> n *= 2).toArray();
        Function<int[], int[]> subtract = e -> Arrays.stream(e).map(n -> n -= 1).toArray();
        Consumer<int[]> printArray = e -> Arrays.stream(e).forEach(n -> System.out.print(n + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                   numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    printArray.accept(numbers);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
