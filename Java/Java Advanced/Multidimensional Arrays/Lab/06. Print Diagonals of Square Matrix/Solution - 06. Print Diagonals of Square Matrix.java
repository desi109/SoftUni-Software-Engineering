import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = rows;
        int[][] matrix = new int[rows][cols];
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == col) {
                    first.add(matrix[row][col]);
                }
            }
        }

        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                if ((row + col) == (rows - 1)) {
                    second.add(matrix[row][col]);
                }
            }
        }

        for (Integer i : first) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        for (Integer i : second) {
            System.out.printf("%d ", i);
        }
    }
}

