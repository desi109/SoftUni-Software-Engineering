import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        Map<String, String> map = new HashMap<>();

        while (!(line = scanner.nextLine()).equals("search")) {
            String[] command = line.split("-");
            String name = command[0];
            String phone = command[1];

            if (!map.containsKey(name)) {
                map.put(name, phone);
            }
        }

        while (!(line = scanner.nextLine()).equals("stop")) {
            if (map.containsKey(line)) {
                System.out.printf("%s -> %s%n", line, map.get(line));
            } else {
                System.out.printf("Contact %s does not exist.%n", line);
            }
        }


    }
}


