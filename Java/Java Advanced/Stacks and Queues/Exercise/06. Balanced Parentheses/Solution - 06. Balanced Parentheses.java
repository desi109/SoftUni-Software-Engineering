import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> deque = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '[' || current == '{' || current == '(') {
                deque.push(current);
            } else {
                if (deque.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char topElement = deque.pop();
                if (current == ']' && topElement != '[') {
                    areBalanced = false;
                    break;
                } else if (current == '}' && topElement != '{') {
                    areBalanced = false;
                    break;
                } else if (current == ')' && topElement != '(') {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
