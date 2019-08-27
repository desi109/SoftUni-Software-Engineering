import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int inDeque = Integer.parseInt(input[0]);
        int deleteDeque = Integer.parseInt(input[1]);
        String item = input[2];

        ArrayDeque<String> numbersDeque = new ArrayDeque<>();
        String[] nums = scanner.nextLine().split(" ");
        for (int i = 0; i < inDeque; i++) {
            numbersDeque.push(nums[i]);
        }

        for (int i = 0; i < deleteDeque; i++) {
            if (numbersDeque.isEmpty()) {
                break;
            }
            numbersDeque.pop();
        }

        if (numbersDeque.isEmpty()) {
            System.out.println(0);
        } else if (numbersDeque.contains(item)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numbersDeque));
        }
    }
}
