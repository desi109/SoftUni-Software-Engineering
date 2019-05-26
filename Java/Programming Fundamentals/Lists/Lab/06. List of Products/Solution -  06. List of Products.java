import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> stuffList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            stuffList.add(line);
        }

        Collections.sort(stuffList);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n", i + 1, stuffList.get(i));
        }
    }
}
