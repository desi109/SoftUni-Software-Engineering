import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n > 0) {
            String line = scanner.nextLine();
            String[] arguments = line.split(" ");

            if (Integer.parseInt(arguments[1]) >= 30) {
                Person person = new Person(arguments[0], Integer.parseInt(arguments[1]));
                people.add(person);
            }

            n--;
        }

        Collections.sort(people, Comparator.comparing(Person::getName));
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }


