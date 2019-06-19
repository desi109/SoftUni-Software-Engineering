import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Articles> articlesList = new ArrayList<>();


        while (n-- > 0) {
            String[] date = scanner.nextLine().split(", ");

            Articles article = new Articles(date[0], date[1], date[2]);
            articlesList.add(article);
        }

//        Not so functional code
//        List <Person> result = new ArrayList<>();
//        for (Person person: people) {
//            if (person.getAge() > 30){
//                result.add(person);
//            }
//        }

        String condition = scanner.nextLine();
        switch (condition) {
            case "title":
                articlesList
                        .stream()
                        .sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
                        .forEach(e -> {
                            System.out.println(e.toString());
                        });
                break;

            case "content":
                articlesList
                        .stream()
                        .sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
                        .forEach(e -> {
                            System.out.println(e.toString());
                        });
                break;

            case "author":
                articlesList
                        .stream()
                        .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(e -> {
                            System.out.println(e.toString());
                        });
                break;

        }
    }
}
