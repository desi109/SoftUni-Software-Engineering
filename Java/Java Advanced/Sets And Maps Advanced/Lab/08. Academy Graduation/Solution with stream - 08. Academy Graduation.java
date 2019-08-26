import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> graduatedStudent = new TreeMap<>();

        while (!(n-- == 0)) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            graduatedStudent.putIfAbsent(name, new ArrayList<>());
            graduatedStudent.get(name).addAll(grades);
        }

        graduatedStudent.forEach((name, grades) -> {
            double avg = grades.stream()
                    .mapToDouble(e -> e).sum() / grades.size();
            System.out.printf("%s is graduated with %s%n", name, avg);
        });

    }
}


