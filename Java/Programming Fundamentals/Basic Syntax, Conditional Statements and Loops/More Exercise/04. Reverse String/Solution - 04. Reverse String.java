import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        for (int i = line.length() - 1; i >= 0; i--) {
            System.out.print(line.charAt(i));
        }
    }
}
