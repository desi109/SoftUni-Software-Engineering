import java.util.ArrayDeque;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String exp = scanner.nextLine();

        String[] els = exp.split("\\s+");

        for (int i = els.length - 1; i >= 0; i--) {
            stack.push(els[i]);
        }

        while (stack.size() > 1) {
            Integer firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            Integer secondNum = Integer.parseInt(stack.pop());

            if ("+".equalsIgnoreCase(op)) {
                stack.push(firstNum + secondNum + "");
            } else {
                stack.push(firstNum - secondNum + "");
            }
        }

        System.out.println(stack.peek());

    }
}





