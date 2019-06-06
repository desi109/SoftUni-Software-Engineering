import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exp = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int starIndex = stack.pop();
                String content = exp.substring(starIndex, i + 1);
                System.out.println(content);
            }
        }

    }
}
