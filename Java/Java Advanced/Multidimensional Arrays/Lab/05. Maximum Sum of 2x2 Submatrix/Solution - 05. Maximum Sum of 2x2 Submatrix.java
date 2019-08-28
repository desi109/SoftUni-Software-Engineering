import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizes = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(sizes[0]);
        int cols = Integer.parseInt(sizes[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(", ");
            for (int column = 0; column < cols; column++) {
                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }


        int bestSum = Integer.MIN_VALUE;

        int resultRow = 0;
        int resultCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow = row;
                    resultCol = col;
                }
            }
        }
        System.out.println(matrix[resultRow][resultCol] + " " + matrix[resultRow][resultCol +1]);
        System.out.println(matrix[resultRow + 1][resultCol] + " " + matrix[resultRow + 1][resultCol +1]);
        System.out.println(bestSum);

    }
}

