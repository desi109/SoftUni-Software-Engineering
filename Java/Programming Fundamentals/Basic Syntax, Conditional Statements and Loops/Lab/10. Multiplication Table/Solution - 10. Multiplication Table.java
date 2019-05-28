import java.util.*;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10 ; i++) {
            int result = num * i;
            System.out.printf("%d X %d = %d\n", num, i, result);

        }
        
    }
}
