package MultidimensionalArrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        //int[][] bestMatrix = new int[3][3];
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startRow = row;
                    startCol = col;
//                    bestMatrix[0][0] = matrix[row][col];
//                    bestMatrix[0][1] = matrix[row][col + 1];
//                    bestMatrix[0][2] = matrix[row][col + 2];
//                    bestMatrix[1][0] = matrix[row + 1][col];
//                    bestMatrix[1][1] = matrix[row + 1][col + 1];
//                    bestMatrix[1][2] = matrix[row + 1][col + 2];
//                    bestMatrix[2][0] = matrix[row + 2][col];
//                    bestMatrix[2][1] = matrix[row + 2][col + 1];
//                    bestMatrix[2][2] = matrix[row + 2][col + 2];
                }
            }

        }
        //findMaxSumAndBestMatrix(rows, cols, matrix, maxSum, bestMatrix);

        System.out.println("Sum = " + maxSum);
        printBestMatrix(matrix, startRow, startCol);
    }

    private static void printBestMatrix(int[][] matrix, int startRow, int startCol) {
        for (int r = startCol; r <= startRow + 2; r++) {
            for (int c = startCol; c <= startCol + 2; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
//
//    private static int findMaxSumAndBestMatrix(int rows, int cols, int[][] matrix, int maxSum, int[][] bestMatrix) {
//        for (int row = 0; row < rows - 2; row++) {
//            for (int col = 0; col < cols - 2; col++) {
//                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
//                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
//                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
//                if (currentSum > maxSum) {
//                    maxSum = currentSum;
//                    bestMatrix[0][0] = matrix[row][col];
//                    bestMatrix[0][1] = matrix[row][col + 1];
//                    bestMatrix[0][2] = matrix[row][col + 2];
//                    bestMatrix[1][0] = matrix[row + 1][col];
//                    bestMatrix[1][1] = matrix[row + 1][col + 1];
//                    bestMatrix[1][2] = matrix[row + 1][col + 1];
//                    bestMatrix[2][0] = matrix[row + 2][col];
//                    bestMatrix[2][1] = matrix[row + 2][col + 1];
//                    bestMatrix[2][2] = matrix[row + 2][col + 2];
//                }
//            }
//
//        }
//        return maxSum;
//    }
}
