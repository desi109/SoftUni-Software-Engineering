import java.util.ArrayDeque;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String text = "";

        while (!("Home").equalsIgnoreCase(text = scanner.nextLine())) {
            if (!"back".equalsIgnoreCase(text)) {
                stack.push(text);
                System.out.println(text);
            } else {
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }

        }
    }
}



