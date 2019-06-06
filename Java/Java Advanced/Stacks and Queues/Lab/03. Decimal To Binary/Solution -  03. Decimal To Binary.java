import java.util.ArrayDeque;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numberDecimal = Integer.parseInt(scanner.nextLine());

        if (numberDecimal == 0) {
            System.out.println(0);
            return;
        }

        while (numberDecimal > 0) {
            stack.push(numberDecimal % 2);
            numberDecimal /= 2;
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }
}
