import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            } else {
                map.put(numbers[i], 1);
            }
        }

        for (Double num : map.keySet()) {
            System.out.printf("%.1f -> %d%n", num, map.get(num));
        }

    }
}





