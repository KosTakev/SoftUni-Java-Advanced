package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> consumer = n -> System.out.println("Sir " + n);

        Arrays.stream(names).forEach(consumer);
    }
}
