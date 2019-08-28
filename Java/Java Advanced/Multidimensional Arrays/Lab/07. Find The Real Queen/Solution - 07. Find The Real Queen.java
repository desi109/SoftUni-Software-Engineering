import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        ArrayDeque<Integer> queueR_C = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            String[] inputCharStr = scanner.nextLine().split(" ");
            for (int col = 0; col < inputCharStr.length; col++) {

                char checkFor_q = inputCharStr[col].charAt(0);
                if (checkFor_q == 'q') {
                    queueR_C.offer(row);
                    queueR_C.offer(col);
                }
                matrix[row][col] = inputCharStr[col].charAt(0);
            }
        }
        boolean fakeQuin;

        while (!queueR_C.isEmpty()) {

            //proverki vuv vsicki posoki

            fakeQuin = false;
            int rowToChech = queueR_C.poll();
            int colToChech = queueR_C.poll();

            for (int col = 0; col < colToChech; col++) { // from Left to q
                if (matrix[rowToChech][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }
            for (int col = colToChech + 1; col < 8; col++) { // from q to Right end
                if (matrix[rowToChech][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }
            for (int row = 0; row < rowToChech; row++) { // from Up to q
                if (matrix[row][colToChech] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }
            for (int row = rowToChech + 1; row < 8; row++) { // from q to Down
                if (matrix[row][colToChech] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }


            int counter = rowToChech;
            for (int col = colToChech + 1; col < 8; col++) { //from q to Right Down
                counter++;
                if (counter > 7) {
                    break;
                }
                if (matrix[counter][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }

            counter = rowToChech;
            for (int col = colToChech - 1; col >= 0; col--) { //from q to Left Up
                counter--;
                if (counter < 0) {
                    break;
                }
                if (matrix[counter][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }

            counter = rowToChech;
            for (int col = colToChech + 1; col < 8; col++) { //from q to Right Up
                counter--;
                if (counter < 0) {
                    break;
                }
                if (matrix[counter][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }

            counter = rowToChech;
            for (int col = colToChech - 1; col >= 0; col--) { //from q to Left Down
                counter++;
                if (counter > 7) {
                    break;
                }
                if (matrix[counter][col] == 'q') {
                    fakeQuin = true;
                    break;
                }
            }


            if (fakeQuin == false) {
                System.out.print(rowToChech + " ");
                System.out.print(colToChech);
                System.out.println();
            }
        }
    }
}
