import java.util.ArrayDeque;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(stack.poll() + " ");
        }

    }
}

