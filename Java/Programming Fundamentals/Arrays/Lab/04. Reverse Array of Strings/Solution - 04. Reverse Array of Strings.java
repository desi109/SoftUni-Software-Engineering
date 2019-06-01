import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = scanner.nextLine()
                .split(" ");
        String[] symbolAnswer = new String[symbols.length];

        for (int i = 0; i < symbols.length; i++) {
            symbolAnswer[i] = symbols[symbols.length - i - 1];
            System.out.print(symbolAnswer[i] + " ");
        }

    }
}
