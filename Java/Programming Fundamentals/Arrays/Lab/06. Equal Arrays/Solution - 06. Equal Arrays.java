import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int index = -1;
        int sum = 0;

        for (int i = 0; i < firstArr.length; i++) {

            if (firstArr[i] != secondArr[i]) {
                index = i;
                break;
            }
            sum += firstArr[i];
        }
        if (index == -1) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);

        }
    }
}
