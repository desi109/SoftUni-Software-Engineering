import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length - 1; i++) {
            int currentNumber = input[i];

            for (int j = i + 1; j < input.length; j++) {

                if (currentNumber + input[j] == number) {
                    System.out.println(currentNumber + " " + input[j]);

                }
            }
        }
    }
}

