import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++)
            printLine(1, i);

        for (int j = 1; j <= n - 1; j++)
            printLine(1, n - j);
    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
