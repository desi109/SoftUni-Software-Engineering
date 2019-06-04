import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        print(a, b);
    }

    private static void print(int a, int b) {
        double result = 1;
        if (a > b) {
            for (int i = b + 1; i <= a; i++) {
                result *= i;
            }
        } else if (a < b) {
            for (int i = a + 1; i <= b; i++) {
               result /= i;
            }
        }
        System.out.printf("%.2f", result);

    }
}


