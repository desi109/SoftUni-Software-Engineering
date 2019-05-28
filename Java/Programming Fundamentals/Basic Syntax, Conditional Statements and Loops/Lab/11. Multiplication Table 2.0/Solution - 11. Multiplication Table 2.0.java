import java.util.*;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        if (num2 >= 0 && num2 <= 10) {
            for (int i = num2; i <= 10; i++) {
                int result = num * i;
                System.out.printf("%d X %d = %d\n", num, i, result);
            }
        } else {
            System.out.printf("%d X %d = %d\n", num, num2, num * num2);
        }

    }
}
