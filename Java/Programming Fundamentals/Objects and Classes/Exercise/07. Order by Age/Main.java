import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();

        while (!line.equals("End")) {
            String[] date = line.split("\\s+");

            Student student = new Student(date[0], Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            studentsList.add(student);
            line = scanner.nextLine();
        }

        studentsList
                .stream()
                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .forEach(e -> {
                    System.out.println(e.toString());
                });
           }
  }
