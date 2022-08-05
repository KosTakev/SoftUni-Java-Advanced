package MultidimensionalArrays_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();
        int angleToRotate = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        ArrayList<String> lineForMatrix = new ArrayList<>();
        int maxLength = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            lineForMatrix.add(line);
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        int rows = lineForMatrix.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < lineForMatrix.get(row).length()) {
                    matrix[row][col] = lineForMatrix.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        MatrixRotation(angleToRotate, matrix, rows, cols);

    }

    private static void MatrixRotation(int angleToRotate, char[][] matrix, int rows, int cols) {
        if (angleToRotate == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleToRotate == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleToRotate == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
        }
    }

