import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        while (n-- > 0) {
            String[] date = scanner.nextLine().split("\\s+");

            Student student = new Student(date[0], date[1], Double.parseDouble(date[2]));
            studentsList.add(student);
        }

        studentsList
                .stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(e -> {
                    System.out.println(e.toString());
                });

    }
 }
