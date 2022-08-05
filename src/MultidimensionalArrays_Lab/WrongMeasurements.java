package MultidimensionalArrays_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner, "\\s+");
        }
        int[] valueIndexes = readArray(scanner, "\\s+");
        int wrongValue = matrix[valueIndexes[0]][valueIndexes[1]];

        List<int[]> indexes = new ArrayList<>();
        List<Integer> correctValues = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    indexes.add(new int[]{row, col});
                    correctValues.add(getCorrectValue(matrix, row, col));
                }
            }
        }
    }

    private static int getCorrectValue(int[][] matrix, int row, int col) {
        int sum = 0;
        int wrongValue = matrix[row][col];
        if (wrongValue != matrix[row - 1] [col]) {
            sum += matrix[row - 1][col];
        }
        if (wrongValue != matrix[row + 1] [col]) {
            sum += matrix[row + 1][col];
        }
        if (wrongValue != matrix[row] [col - 1]) {
            sum += matrix[row][col - 1];
        }
        if (wrongValue != matrix[row] [col + 1]) {
            sum += matrix[row][col + 1];
        }
        return sum;
    }

    public static int[] readArray(Scanner scanner, String separator) {
        return Arrays.stream(scanner.nextLine().split(separator)).
                mapToInt(Integer::parseInt).toArray();
    }
}
