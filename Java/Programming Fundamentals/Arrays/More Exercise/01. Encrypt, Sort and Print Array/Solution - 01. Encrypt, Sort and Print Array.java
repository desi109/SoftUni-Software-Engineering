import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] result = new int[n];
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);

                if (vowels.contains(letter + "") == true) {
                    count += str.length() * ((int) letter);
                } else {
                    count += ((int) letter) / str.length();
                }
            }

            result[i] = count;
        }

        Arrays.sort(result);

        System.out.println();
        for (int num : result) {
            System.out.println(num);
        }

    }
}
