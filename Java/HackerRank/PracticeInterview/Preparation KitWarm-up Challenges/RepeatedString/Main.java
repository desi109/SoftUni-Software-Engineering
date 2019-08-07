import java.io.*;
import java.util.*;

public class Main {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long quotient = n / (s.length());
        long remainder = n % (s.length());
        long count = 0;

        if ((s.length() == 1) && (s.charAt(0) == 'a')) {
            return n;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        count = count * quotient;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println(result);
    }
}
