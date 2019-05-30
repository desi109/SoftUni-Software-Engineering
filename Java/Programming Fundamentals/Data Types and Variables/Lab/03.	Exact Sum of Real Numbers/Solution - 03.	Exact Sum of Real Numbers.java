import java.math.BigDecimal;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal("0");

        while (n >= 1){
            BigDecimal num = new BigDecimal(scanner.nextLine());

            sum = sum.add(num);
            n--;
        }

        System.out.println(sum);

    }
}
