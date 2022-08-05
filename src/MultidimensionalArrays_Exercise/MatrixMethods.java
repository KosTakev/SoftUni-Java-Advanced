package MultidimensionalArrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMethods {
    public static void main(String[] args) {

    }
    public static void printMatrix (int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] readMatrix (Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();

            matrix[i] = array;
        }
        return matrix;
    }
}
