import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        String[] output = new String[30];
        int index = 0;

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j])) {
                    output[index++] = second[i];
                }
            }
        }

        for (int i = 0; i < output.length; i++) {
            if (output[i] != null) {
                System.out.print(output[i] + " ");
            }

        }
    }
}
