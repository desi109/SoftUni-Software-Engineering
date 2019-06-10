import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringNumbers = scanner.nextLine().split(", ");

        List<Integer> evenNumbers = Arrays.stream(stringNumbers)
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());


        List<String> numbers = evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        String evenNums = String.join(", ", numbers);
        System.out.println(evenNums);

        evenNumbers.sort(Integer::compareTo);
        List<String> evenSortedNums = evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        String sortedNums = String.join(", ", evenSortedNums);
        System.out.println(sortedNums);

    }
}
