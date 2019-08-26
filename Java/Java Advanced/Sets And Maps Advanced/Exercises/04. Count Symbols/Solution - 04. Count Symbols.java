import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();


        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        map.forEach((str, times) -> {
            System.out.printf("%s: %d time/s%n", str, times);
        });

    }
}


