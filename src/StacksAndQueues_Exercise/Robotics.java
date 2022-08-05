package StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] dataRobots = input.split(";");
        LinkedHashMap<String, Integer> robots = getRobotsMap(dataRobots);
        LinkedHashMap<String, Integer> workingTime = getRobotsWorkingTimeMap(dataRobots);

        String startTime = scanner.nextLine();
        int startTimeInSeconds = getStartTimeInSeconds(startTime);

        ArrayDeque<String> products = new ArrayDeque<>();
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            products.offer(product);
            product = scanner.nextLine();
        }
        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            startTimeInSeconds++;
            decreaseWorkingTime(workingTime);
            boolean isTaken = false;
            for (Map.Entry<String, Integer> robot : workingTime.entrySet()) {
                if (robot.getValue() == 0) {

                    System.out.println(robot.getKey() + " - "
                            + currentProduct + " "
                            + "[" + getStartTime(startTimeInSeconds) + "]");
                    workingTime.put(robot.getKey(), robots.get(robot.getKey()));
                    isTaken = true;
                    break;
                }
            }
            if (!isTaken) {
                products.offer(currentProduct);
            }
        }

    }

    private static void decreaseWorkingTime(LinkedHashMap<String, Integer> workingTime) {
        for (Map.Entry<String, Integer> robot : workingTime.entrySet()) {
                if (robot.getValue() > 0) {
                    workingTime.put(robot.getKey(), robot.getValue() - 1);
                }
        }
    }

    private static String getStartTime(int startTimeInSeconds) {
        int hours = (startTimeInSeconds / 3600) % 24;
        int minutes = startTimeInSeconds % 3600 / 60;
        int seconds = startTimeInSeconds % 60;

        return String.format("%02d:%02d:%02d",hours, minutes, seconds);
    }

    private static LinkedHashMap<String, Integer> getRobotsWorkingTimeMap(String[] dataRobots) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String dataRobot : dataRobots) {
            String name = dataRobot.split("-")[0];
            int processingTime = Integer.parseInt(dataRobot.split("-")[1]);
            robots.put(name, 0);
        }
        return robots;
    }

    private static int getStartTimeInSeconds(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int minutes = Integer.parseInt(startTime.split(":")[1]);
        int seconds = Integer.parseInt(startTime.split(":")[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] dataRobots) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String dataRobot : dataRobots) {
            String name = dataRobot.split("-")[0];
            int processingTime = Integer.parseInt(dataRobot.split("-")[1]);
            robots.put(name, processingTime);
        }
        return robots;
    }
}
