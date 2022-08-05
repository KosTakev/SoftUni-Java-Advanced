package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = Arrays.stream(input)
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);

        System.out.println(getMinNumber.apply(numbers));
    }
}
