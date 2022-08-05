package MultidimensionalArrays_Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMatrices(firstMatrix, secondMatrix);

        System.out.println(areEqual ? "equal" : "not equal");

        // Прочитане на Матрица от конзолата със стрийм:
//        for (int i = 0; i < rows; i++) {
//
//            int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).
//                    mapToInt(Integer::parseInt).toArray();
//
//            firstMatrix[i] = array;
        //       }

        // Прочитане на Матрица от конзолата без стрийм:
//        for (int r = 0; r < rows; r++) {
//            String[] line = scanner.nextLine().split("\\s+");
//            for (int c = 0; c < columns; c++) {
//                firstMatrix[r][c] = Integer.parseInt(line[c]);
//            }

        }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArray = firstMatrix[row];
            int[] secondArray = secondMatrix[row];

            if (firstArray.length != secondArray.length) {
                return false;
            }
            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]) {
                    return false;
                }
            }
        }
        return true;
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
