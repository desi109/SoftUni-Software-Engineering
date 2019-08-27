import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        while (n-- > 0) {
            String[] commands = scanner.nextLine().split(" ");
            String command = commands[0];

            switch (command) {
                case "1":
                    int num = Integer.parseInt(commands[1]);
                    numbers.push(num);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(numbers));
                    break;
            }
        }
    }
}
