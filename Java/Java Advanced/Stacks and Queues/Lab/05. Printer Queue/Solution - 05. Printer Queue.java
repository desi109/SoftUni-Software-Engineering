import java.util.ArrayDeque;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = "";

        while (!"print".equalsIgnoreCase(input = scanner.nextLine())) {

            if (!"cancel".equalsIgnoreCase(input)) {
                stack.offer(input);
            } else {
                if (!stack.isEmpty()) {
                    System.out.println("Canceled " + stack.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
        }

        if (!stack.isEmpty()){
            while (!stack.isEmpty()){
                System.out.println(stack.poll());
            }
        }
    }

}
