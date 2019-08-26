import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        Map<String, String> map = new LinkedHashMap<>();

        while (!(line = scanner.nextLine()).equals("stop")) {
            String mail = scanner.nextLine();
            map.put(line, mail);
        }


        map.forEach((l, m) -> {
            if (!(m.contains("us") || m.contains("uk") || m.contains("com"))) {
                System.out.printf("%s -> %s%n", l, m);
            }
        });

    }
}
