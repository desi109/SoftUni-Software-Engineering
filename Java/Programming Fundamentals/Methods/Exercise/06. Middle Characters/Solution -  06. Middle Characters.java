import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        print(text);
    }

    static void print(String text) {

        if (text.length() % 2 != 0) {
            System.out.println(text.charAt(text.length() / 2));
        } else {
            int num = text.length() / 2;
            System.out.print(text.charAt(num - 1));
            System.out.print(text.charAt(num));
        }

    }
}
