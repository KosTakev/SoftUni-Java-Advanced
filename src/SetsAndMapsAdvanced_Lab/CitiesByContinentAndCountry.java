package SetsAndMapsAdvanced_Lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continentalMap = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continentalMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countryMap = continentalMap.get(continent);
            countryMap.putIfAbsent(country, new ArrayList<>());
            List<String> citiesList = countryMap.get(country);
            citiesList.add(city);

        }
        continentalMap.entrySet().
                stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().
                    stream().
                    forEach(innerEntry -> {
                        System.out.println("  " + innerEntry.getKey() + " -> " +
                                String.join(", ", innerEntry.getValue()));
                    });
        });
    }
}
