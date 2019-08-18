import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            double firstNum = Double.parseDouble(scanner.next());
            double secondNum = Double.parseDouble(scanner.next());

            int sum = 0;
            if (firstNum > secondNum) {
                double num1 = Math.abs(firstNum);
                while (num1 > 0) {
                    sum += (num1 % 10);
                    num1 /= 10;
                }
            } else {
                double num2 = Math.abs(secondNum);
                while (num2 > 0) {
                    sum += (num2 % 10);
                    num2 /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}

