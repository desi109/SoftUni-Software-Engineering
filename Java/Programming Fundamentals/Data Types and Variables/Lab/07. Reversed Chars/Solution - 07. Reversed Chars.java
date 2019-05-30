import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter1 = scanner.next().charAt(0);
        char letter2 = scanner.next().charAt(0);
        char letter3 = scanner.next().charAt(0);

        System.out.printf("%c %c %c", letter3, letter2,letter1);


    }
}
