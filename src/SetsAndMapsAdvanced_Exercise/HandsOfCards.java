package SetsAndMapsAdvanced_Exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersCads = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String inputCards = input.split(": ")[1];
            String[] cardsArr =  inputCards.split(", ");
            Set<String> cards = new HashSet<>();
            Collections.addAll(cards, cardsArr);

            if (playersCads.containsKey(name)) {
                Set<String> currentCards = playersCads.get(name);
                currentCards.addAll(cards);
                playersCads.put(name, currentCards);
            } else {
                playersCads.put(name, cards);
            }

            input = scanner.nextLine();
        }

        playersCads.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int points = getPlayersPoints(entry.getValue());
            System.out.printf("%s: %d%n", name, points);
        });


    }

    private static int getPlayersPoints(Set<String> cards) {
        Map<Character, Integer> points = getCardValue();
        int sum = 0;
        for (String card : cards) {
            int currentPoints = 0;
            if(card.contains("10")) {
                char type = card.charAt(2);
                currentPoints = 10 + points.get(type);
            } else {
                char number = card.charAt(0);
                char type = card.charAt(1);
                currentPoints = points.get(number) * points.get(type);
            }
            sum += currentPoints;
        }

        return sum;
    }
    private static Map<Character, Integer> getCardValue () {
        Map<Character, Integer> pointsMap = new HashMap<>();
        pointsMap.put('2', 2);
        pointsMap.put('3', 3);
        pointsMap.put('4', 4);
        pointsMap.put('5', 5);
        pointsMap.put('6', 6);
        pointsMap.put('7', 7);
        pointsMap.put('8', 8);
        pointsMap.put('9', 9);
        pointsMap.put('J', 11);
        pointsMap.put('Q', 12);
        pointsMap.put('K', 13);
        pointsMap.put('A', 14);
        pointsMap.put('S', 4);
        pointsMap.put('H', 3);
        pointsMap.put('D', 2);
        pointsMap.put('C', 1);
        return pointsMap;

    }
}
