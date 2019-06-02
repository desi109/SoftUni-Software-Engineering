import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        checkSign(number);
    }

    static void checkSign(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}





