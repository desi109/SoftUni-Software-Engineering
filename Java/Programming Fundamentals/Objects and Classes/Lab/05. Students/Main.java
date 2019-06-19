import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Student student = new Student(firstName, lastName, age, city);

            students.add(student);
            line = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(filterCity))
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),           student.getLastName(), student.getAge());

        }
    }
}

