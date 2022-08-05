package FunctionalProgramming_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vatCalculator = v -> v * 1.2;

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(p -> System.out.printf("%.2f%n" ,p));
    }
}
