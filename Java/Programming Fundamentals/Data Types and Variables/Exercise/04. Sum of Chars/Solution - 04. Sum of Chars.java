import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (n-- > 0){
            String letter = scanner.nextLine();
            sum += letter.charAt(0);
        }
        System.out.printf("The sum equals: %d", sum);

    }
}
