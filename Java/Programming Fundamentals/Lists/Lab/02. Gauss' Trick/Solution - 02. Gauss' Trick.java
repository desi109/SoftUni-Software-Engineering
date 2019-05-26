import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");

        List<Integer> integersList = new ArrayList<>();

        for (String number : numbers) {
            integersList.add(Integer.parseInt(number));
        }

        int sizeHalf = integersList.size() / 2;

        for (int i = 0; i < sizeHalf; i++) {
            int firstNum = integersList.get(i);
            int index = (integersList.size() - 1);
            int secondNum = integersList.get(index);

            integersList.set(i, firstNum + secondNum);
            integersList.remove(index);
        }

        System.out.println(integersList.toString().replaceAll("\\[|,|\\]", ""));
    }
}
