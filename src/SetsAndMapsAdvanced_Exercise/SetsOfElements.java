package SetsAndMapsAdvanced_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int firstSetLength = Integer.parseInt(input[0]);
        int secondSetLength = Integer.parseInt(input[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < secondSetLength; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        //longest way:

//        Set<Integer> repeatedElements = new LinkedHashSet<>();
//        for (Integer number : firstSet) {
//            if (secondSet.contains(number)) {
//                repeatedElements.add(number);
//            }
//        }
        //easiest way:

        firstSet.retainAll(secondSet);
        firstSet.forEach(number -> System.out.print(number + " "));
    }
}
