import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = 1; i <= num; i++) {
            String ch = scanner.nextLine();
            int convertIndex = (int) ch.charAt(0) + key;
            result += (char) convertIndex;
        }

        System.out.println(result);
    }
}
