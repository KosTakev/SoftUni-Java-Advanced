package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
        }
        int row = 0;
        int col = 0;

        while (row < size && col < size) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }
//        for (int index = 0; index < size; index++) {
//            System.out.print(matrix[index][index] + " ");
//        }
        System.out.println();

        row = size - 1;
        col = 0;

        while (row >= 0 && col < size) {
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
//        for (int index = 0; index < size; index++) {
//            System.out.print(matrix[(size - 1) - index][index] + " ");
//        }
        System.out.println();
    }
}
