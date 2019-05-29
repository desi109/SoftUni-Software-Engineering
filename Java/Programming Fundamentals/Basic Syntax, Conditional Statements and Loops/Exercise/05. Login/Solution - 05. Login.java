import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reversedUsername = "";

        for (int i = 0; i < username.length(); i++) {
            reversedUsername += username.charAt(username.length() - i - 1);
        }

        int count = 1;

        String inputData = scanner.nextLine();
        while (!inputData.equals(reversedUsername)) {

            if (count++ == 4) {
                System.out.printf("User %s blocked!\n", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            inputData = scanner.nextLine();
        }

        System.out.printf("User %s logged in.\n", username);
    }
}
