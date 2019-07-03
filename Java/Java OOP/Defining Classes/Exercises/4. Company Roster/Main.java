import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Employee> employees = new ArrayList<>();

        while (n-- > 0) {
            String[] arguments = reader.readLine().split("\\s+");

            String name = arguments[0];
            double salary = Double.parseDouble(arguments[1]);
            String position = arguments[2];
            String department = arguments[3];


            Employee employee = null;

            switch (arguments.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (arguments[4].matches("\\d+")) {
                        int age = Integer.parseInt(arguments[4]);
                        employee = new Employee(name, salary, position, department, age);
                    } else {
                        String email = arguments[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    String email = arguments[4];
                    int age = Integer.parseInt(arguments[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }

            employees.add(employee);
        }

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1, e2) ->
                        Double.compare(
                                e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                                e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()))

                .limit(1)
                .forEach(d -> {
                    StringBuilder result = new StringBuilder();
                    result.append(String.format("Highet Average Salary: %s", d.getKey()))
                            .append(System.lineSeparator());
                    d.getValue().stream()
                            .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                            .forEach(employee -> result.append(employee).append(System.lineSeparator()));

                    System.out.println(result.toString());
                });


    }
}
