import java.util.*;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int numNow = 1;

        while (nums >= 1) {
            if (numNow % 2 != 0) {
                System.out.println(numNow);
                sum += numNow;
                numNow++;
                nums--;
            }
            else {numNow++;}
        }
        System.out.printf("Sum: %d", sum);

    }
}
