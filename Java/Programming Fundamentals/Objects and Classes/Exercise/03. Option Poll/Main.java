import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] date = scanner.nextLine().split("\\s+");

            String name = date[0];
            int age = Integer.parseInt(date[1]);
            Person person = new Person(name, age);

            people.add(person);
        }

//        Not so functional code
//        List <Person> result = new ArrayList<>();
//        for (Person person: people) {
//            if (person.getAge() > 30){
//                result.add(person);
//            }
//        }

        people  .stream()
                .filter(person -> person.getAge() > 30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(e -> {
                    System.out.println(e.toString());
                });
    }
}
