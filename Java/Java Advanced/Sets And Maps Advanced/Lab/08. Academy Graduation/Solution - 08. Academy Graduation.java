import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double[]> graduatedStudent = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] line = scanner.nextLine().split("\\s+");
            Double[] grades = new Double[line.length];

            for (int j = 0; j < line.length; j++) {
                grades[j] = Double.parseDouble(line[j]);
            }

            graduatedStudent.put(name, grades);
        }

        for (String name : graduatedStudent.keySet()) {
            Double[] grades = graduatedStudent.get(name);
            double sum = 0.0;
            for (Double grade : grades) {
                sum += grade;
            }

            System.out.printf("%s is graduated with %s%n", name, (sum / grades.length));

        }
    }

}
