import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        Map<String, Integer> map = new HashMap<>();

        while (!(line = scanner.nextLine()).equals("stop")) {

            if (!map.containsKey(line)) {
                map.put(line, 0);
            }
            
            int num = Integer.parseInt(scanner.nextLine());
            map.put(line, map.get(line) + num);
        }

        map.forEach((l, n) -> System.out.printf("%s -> %d%n", l, n));

    }
}


