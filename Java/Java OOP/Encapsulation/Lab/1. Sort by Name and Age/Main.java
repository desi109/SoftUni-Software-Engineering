import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] arguments = reader.readLine().split("\\s+");

            String firstName = arguments[0];
            String lastName = arguments[1];
            int age = Integer.parseInt(arguments[2]);

            Person person = new Person(firstName, lastName, age);
            people.add(person);
        }

        Collections.sort(people, (p1, p2) -> {
            int sComp = p1.getFirstName().compareTo(p2.getFirstName());

            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }

        });
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}

