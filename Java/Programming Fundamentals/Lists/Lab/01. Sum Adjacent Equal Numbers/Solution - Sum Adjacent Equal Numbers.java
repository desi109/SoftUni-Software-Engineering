import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");

        List<Double> doublesList = new ArrayList<>();

        for (String number : numbers) {
            doublesList.add(Double.parseDouble(number));
        }

        for (int i = 0; i < doublesList.size() - 1; i++) {
            double firstNum = doublesList.get(i);
            double secondNum = doublesList.get(i + 1);

            if (firstNum == secondNum) {
                double sum = firstNum + secondNum;
                doublesList.set(i, sum);
                doublesList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(concatListElements(doublesList));
    }

    static String concatListElements(List<Double> list) {
        String someString = "";
        DecimalFormat format = new DecimalFormat("#.###");

        for (Double num : list) {
            someString += format.format(num) + " ";
        }
        return someString.trim();
    }
}
