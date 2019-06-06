import java.util.ArrayDeque;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsCount = parameters[0];
        int countToRemove = parameters[1];
        int lookUpElement = parameters[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(numbers::push);

        while (countToRemove-- > 0) {
            numbers.pop();
        }
        if (numbers.contains(lookUpElement)) {
            System.out.println("true");
        } else {
            if (numbers.size() == 0) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;

                while (!numbers.isEmpty()) {
                    int number = numbers.pop();
                    if (number < min) {
                        min = number;
                    }
                }

                System.out.println(min);
            }
        }

    }
}

