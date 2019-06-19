import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] date = scanner.nextLine().split(", ");

        Articles articles = new Articles(date[0], date[1], date[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    articles.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(input[1]);
                    break;
                case "Rename":
                    articles.rename(input[1]);
                    break;
            }
        }

        System.out.println(articles);

    }

}

