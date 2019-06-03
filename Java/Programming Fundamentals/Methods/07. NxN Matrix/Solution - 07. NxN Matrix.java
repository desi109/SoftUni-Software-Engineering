import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        print(a);
    }

    static void print(int a) {

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.printf("%d ", a);
            }
            System.out.println();
        }

    }
}

