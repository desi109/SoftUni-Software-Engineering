import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int makeAnagram(String a, String b) {
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> s2 = new HashMap<>();
        int output = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            s1.put((char) i, 0);
            s2.put((char) i, 0);
        }

        for (char c : a.toCharArray())
            s1.put(c, s1.get(c) + 1);

        for (char c : b.toCharArray())
            s2.put(c, s2.get(c) + 1);

        for (char letter : s1.keySet()) {
            int f1 = s1.get(letter);
            int f2 = s2.get(letter);

            output += Math.abs(f1 - f2);
        }
        return output;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);
    }
}
