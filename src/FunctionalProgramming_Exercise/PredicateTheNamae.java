package FunctionalProgramming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateTheNamae {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> nameCheck = n -> n.length() <= length;

        Arrays.stream(names).filter(nameCheck).forEach(e -> System.out.println(e));
    }
}
