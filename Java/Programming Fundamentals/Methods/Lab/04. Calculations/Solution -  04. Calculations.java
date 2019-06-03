import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
        }
    }

    private static void add(int a, int b) {

        System.out.println(a + b);
    }

    private static void multiply(int a, int b) {

        System.out.println(a * b);
    }

    private static void subtract(int a, int b) {

        System.out.println(a - b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}


