import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int[] mainMasiv = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensedMasiv = new int[mainMasiv.length - 1];

        if (mainMasiv.length == 1) {
            System.out.println(mainMasiv[0]);
            return;
        }

        for (int i = 0; i < mainMasiv.length; i++) {
            for (int j = 0; j < condensedMasiv.length - i; j++) {
                condensedMasiv[j] = mainMasiv[j] + mainMasiv[j + 1];
            }
            mainMasiv = condensedMasiv;
        }

        System.out.println(condensedMasiv[0]);
    }
}
