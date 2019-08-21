import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] list = scanner.nextLine().split(" ");
            String name = list[0];
            double grade = Double.parseDouble(list[1]);

            List<Double> allGrades = new ArrayList<>();

            if (map.containsKey(name)) {
                allGrades = map.get(name);

            }
            allGrades.add(grade);
            map.put(name, allGrades);
        }

        for (String name : map.keySet()) {
            System.out.printf("%s -> ", name);
            double gradeSum = 0.0;
            List<Double> allGrades = map.get(name);

            for (Double grade: allGrades) {
                gradeSum += grade;
                System.out.printf("%.2f ", grade);
            }

            double avg = gradeSum / allGrades.size();
            System.out.printf("(avg: %.2f)%n ", ((avg * 10000) / 10000.00));
        }

    }
}
