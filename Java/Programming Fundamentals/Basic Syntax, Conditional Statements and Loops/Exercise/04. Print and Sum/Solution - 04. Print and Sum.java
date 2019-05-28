import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1;

        System.out.print(num1);
        for (int i = num1+1; i <= num2 ; i++) {
            System.out.print(" " + i);
            sum+=i;
        }

        System.out.println();
        System.out.println("Sum: " + sum);

    }
}
