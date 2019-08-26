import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> users = new LinkedHashSet<>();

        while (!(n-- == 0)) {
            String name = scanner.nextLine();
            users.add(name);
        }

        for (String name : users) {
            System.out.println(name);
        }
    }
}


