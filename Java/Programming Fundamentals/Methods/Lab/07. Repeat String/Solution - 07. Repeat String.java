import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        print(text, n);
    }

    public static void print(String text, int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(text);
        }

    }

}

