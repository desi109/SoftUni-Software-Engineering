import java.util.*;

public class Main {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int element = ar[i];

            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");


        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println();
        System.out.println(result);


        scanner.close();
    }
}
