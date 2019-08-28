import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrixOne = new char[rows][cols];
        char[][] matrixTwo = new char[rows][cols];

        for (int i = 0; i < rows * 2; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            for (int col = 0; col < elements.length; col++) {
                if (i < rows) {
                    matrixOne[i][col] = elements[col].charAt(0);
                } else {
                    matrixTwo[i - rows][col] = elements[col].charAt(0);
                }
            }
        }

        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = matrixOne[row][col];
                char secondElement = matrixTwo[row][col];

                if (firstElement != secondElement) {
                    resultMatrix[row][col] = '*';
                    continue;
                }
                resultMatrix[row][col] = firstElement;

            }
        }

        for (char[] matrix : resultMatrix) {
            System.out.println(Arrays.toString(matrix).replaceAll("\\[|\\]|\\,", ""));
        }

    }
}

