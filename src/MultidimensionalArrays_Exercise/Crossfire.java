package MultidimensionalArrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];
        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {
            int row = Integer.parseInt(command.split("\\s+")[0]);
            int col = Integer.parseInt(command.split("\\s+")[1]);
            int radius = Integer.parseInt(command.split("\\s+")[2]);

            for (int r = row - radius; r <= row + radius; r++) {
                if (r > 0 && r < rows) {
                    matrix[r][col] = 0;
                }
            }

            for (int c = col - radius; c <= col + radius; c++) {
                if (c > 0 && c < cols) {
                    matrix[row][c] = 0;
                }
            }
            removeNullsFromMatrix(matrix, rows, cols);
            command = scanner.nextLine();
        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static void removeNullsFromMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            int[] currentRow = matrix[row];
        }
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int num = 1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = num++;
            }
        }
    }
}
