package MultidimensionalArrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossfireLISTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        fillTheMatrix(matrix, rows, cols);


        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {
            int row = Integer.parseInt(command.split("\\s+")[0]);
            int col = Integer.parseInt(command.split("\\s+")[1]);
            int radius = Integer.parseInt(command.split("\\s+")[2]);

            for (int r = row - radius ; row <= row + radius; row++) {
                if (isInMatrix(radius, row, col, matrix )) {
                    matrix.get(r).remove(col);
                }
            }
            for (int c = col + radius; c >= col - radius; c--) {
                if (isInMatrix(radius, row, col, matrix)) {
                    matrix.get(row).remove(c);
                }
            }

            command = scanner.nextLine();
        }
        printMatrix(matrix);
    }

    private static boolean isInMatrix(int radius, int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }
}
