package SetsAndMapsAdvanced_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> username = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            username.add(name);
        }

//        for (String s : username) {
//            System.out.println(s);
//        }
        username.forEach(name -> System.out.println(name));
    }
}
