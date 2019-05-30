import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
