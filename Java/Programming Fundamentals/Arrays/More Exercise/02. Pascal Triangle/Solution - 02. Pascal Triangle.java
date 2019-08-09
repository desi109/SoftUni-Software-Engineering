import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int n = 0; n < num; n++) {
            for (int k = 0; k <= n; k++)
                System.out.print(pascalTrig(n, k) + " ");

            System.out.println();
        }
    }

    static int pascalTrig(int n, int k) {
        int result = 1;

        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
